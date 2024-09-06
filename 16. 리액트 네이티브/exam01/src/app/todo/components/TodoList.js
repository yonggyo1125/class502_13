import React from 'react';
import { FaCheckSquare, FaRegCheckSquare } from 'react-icons/fa';
import { CiSquareRemove } from 'react-icons/ci';
import styled from 'styled-components';

const ItemBox = ({item, onToggle, onRemove}) => {
  const {id, title, content, done } = item;
  return (
    <li key={id} onClick={() => onToggle(id)}>
                <div>
                  {done ? <FaCheckSquare /> : <FaRegCheckSquare />}
                  {title}
                  <CiSquareRemove onClick={() => onRemove(id)} />
                </div>
                {content && <div>{content}</div>}
      </li>);
};


const TodoList = ({ items, onToggle, onRemove }) => {
  return (
    <ul>
      {items &&
        items.length > 0 &&
        items.map(({ id, title, content, done }) => (
          
        ))}
    </ul>
  );
};

export default React.memo(TodoList);
