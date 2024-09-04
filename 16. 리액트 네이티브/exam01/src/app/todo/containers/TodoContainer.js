'use client';
import React, { useState } from 'react';
import { produce } from 'immer';
import TodoForm from '../components/TodoForm';
import TodoList from '../components/TodoList';

const TodoContainer = () => {
  const [items, setItems] = useState([
    { id: 1, title: '할일1', done: true },
    { id: 2, title: '할일2', done: false },
    { id: 3, title: '할일3', done: false },
  ]);
  const [form, setForm] = useState({});

  const onToggle = (id) => {
    /*
    const newItems = items.map((item) =>
      id === item.id ? { ...item, done: !item.done } : item,
    );
    setItems(newItems);
    */
    /*
    setItems((prev) =>
      prev.map((item) =>
        item.id === id ? { ...item, done: !item.done } : item,
      ),
    );
    */
    setItems(
      produce((draft) => {
        draft
          .filter((item) => item.id === id)
          .forEach((item) => {
            item.done = !item.done;
          });
      }),
    );
  };

  const onRemove = (id) => {
    // filter 메서드
    setItems((items) => items.filter((item) => item.id !== id));
  };

  const onSubmit = (e) => {
    e.preventDefault(); // 양식 기본 동작 차단
  };

  return (
    <>
      <TodoForm onSubmit={onSubmit} />
      <TodoList items={items} onToggle={onToggle} onRemove={onRemove} />
    </>
  );
};

export default TodoContainer;
