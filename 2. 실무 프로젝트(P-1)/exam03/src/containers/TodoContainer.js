import { useState, useRef, useCallback } from 'react';
import AddTodo from '../components/AddTodo';
import TodoList from '../components/TodoList';

const intialValue = [
  { id: 1, title: '할일1', done: true },
  { id: 2, title: '할일2', done: false },
  { id: 3, title: '할일3', done: false },
];

let submitFunc;

const TodoContainer = () => {
  // 업데이트 시, 매번 호출
  const [items, setItems] = useState(intialValue);
  const [todo, setTodo] = useState('');
  const [message, setMessage] = useState('');

  let id = useRef(4); // 할일 id

  // 할일 등록 처리
  const onSubmit = useCallback(
    (e) => {
      e.preventDefault();

      if (!todo.trim()) {
        setMessage('할일을 입력하세요.');
        return;
      }

      setItems((prevItems) => {
        return prevItems.concat({
          id: id.current,
          title: todo.trim(),
          done: false,
        });
      });

      id.current++;

      setTodo('');
      setMessage('');
    },
    [todo],
  );

  console.log('같은 함수 : ? ', submitFunc === onSubmit);
  submitFunc = onSubmit;

  // 할일 입력시 todo 상태값 변경
  const onChange = useCallback((e) => setTodo(e.currentTarget.value), []);

  // 할일 목록 완료 여부 토글(true -> false, false -> true)
  const onToggle = useCallback((id) => {
    /*
      const newItems = items.map((item) =>
        item.id === id ? { ...item, done: !item.done } : item,
      );
      setItems(newItems);
    */

    setItems((prevItems) => {
      return prevItems.map((item) =>
        item.id === id ? { ...item, done: !item.done } : item,
      );
    });
  }, []);

  // 할일 목록 제거
  const onRemove = useCallback(
    (id) => {
      /*
      const newItems = items.filter((item) => item.id !== id);
      setItems(newItems);
      */
      setItems((prevItems) => {
        return prevItems.filter(item => item.id !== id)
      });
    },
    [],
  );

  return (
    <>
      <AddTodo
        onSubmit={onSubmit}
        onChange={onChange}
        todo={todo}
        message={message}
      />
      <TodoList items={items} onToggle={onToggle} onRemove={onRemove} />
    </>
  );
};

export default TodoContainer;
