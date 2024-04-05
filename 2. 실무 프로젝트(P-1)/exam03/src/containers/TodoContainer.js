import { useState, useRef } from 'react';
import AddTodo from '../components/AddTodo';
import TodoList from '../components/TodoList';

const intialValue = [
  { id: 1, title: '할일1', done: true },
  { id: 2, title: '할일2', done: false },
  { id: 3, title: '할일3', done: false },
];

const TodoContainer = () => {
  const [items, setItems] = useState(intialValue);
  const [todo, setTodo] = useState('');
  const [message, setMessage] = useState('');

  let id = useRef(4); // 할일 id

  // 할일 등록 처리
  const onSubmit = (e) => {
    e.preventDefault();

    if (!todo.trim()) {
      setMessage('할일을 입력하세요.');
      return;
    }

    const newItems = items.concat({
      id: id.current,
      title: todo.trim(),
      done: false,
    });

    setItems(newItems);

    id.current++;

    setTodo('');
    setMessage('');
  };

  // 할일 입력시 todo 상태값 변경
  const onChange = (e) => setTodo(e.currentTarget.value);

  return (
    <>
      <AddTodo
        onSubmit={onSubmit}
        onChange={onChange}
        todo={todo}
        message={message}
      />
      <TodoList items={items} />
    </>
  );
};

export default TodoContainer;
