import React from 'react';

const TodoList = ({ items }) => {
  return (
    <ul>
      {items &&
        items.length > 0 &&
        items.map((item) => <li key={item.id}>{item.title}</li>)}
    </ul>
  );
};

export default TodoList;
