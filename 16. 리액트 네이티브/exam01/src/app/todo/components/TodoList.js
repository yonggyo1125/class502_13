import React from 'react';
import { FaCheckSquare, FaRegCheckSquare } from 'react-icons/fa';

const TodoList = ({ items, onToggle }) => {
  return (
    <ul>
      {items &&
        items.length > 0 &&
        items.map(({ id, title, done }) => (
          <li key={id} onClick={() => onToggle(id)}>
            {done ? <FaCheckSquare /> : <FaRegCheckSquare />}
            {title}
          </li>
        ))}
    </ul>
  );
};

export default TodoList;
