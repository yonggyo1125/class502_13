'use client';
import React, { useState } from 'react';
import TodoForm from '../components/TodoForm';
import TodoList from '../components/TodoList';

const TodoContainer = () => {
  const [items, setItems] = useState([
    { id: 1, title: '할일1', done: true },
    { id: 2, title: '할일2', done: false },
    { id: 3, title: '할일3', done: false },
  ]);

  const onToggle = (id) => {
    const newItems = items.map((item) =>
      id === item.id ? { ...item, done: !item.done } : item,
    );
    setItems(newItems);
  };

  return (
    <>
      <TodoForm />
      <TodoList items={items} onToggle={onToggle} />
    </>
  );
};

export default TodoContainer;
