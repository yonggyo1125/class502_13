import { useState } from 'react';
import AddTodo from '../components/AddTodo';
import TodoList from '../components/TodoList';

const intialValue = [
  { id: 1, title: '할일1', done: true },
  { id: 2, title: '할일2', done: false },
  { id: 3, title: '할일3', done: false },
];

const TodoContainer = () => {
  const [items, setItems] = useState(intialValue);

  return (
    <>
      <AddTodo />
      <TodoList items={items} />
    </>
  );
};

export default TodoContainer;
