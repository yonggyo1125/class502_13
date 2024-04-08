import { MdCheckBox, MdCheckBoxOutlineBlank } from 'react-icons/md';
import { FaRegTrashCan } from 'react-icons/fa6';

const TodoList = ({ items, onToggle, onRemove }) => {
  return (
    <ul>
      {items.map(({ id, title, done }) => (
        <li key={id}>
          <span onClick={() => onToggle(id)}>
            {done ? <MdCheckBox /> : <MdCheckBoxOutlineBlank />}
            {title}
          </span>
          <button type="button" onClick={() => onRemove(id)}>
            <FaRegTrashCan />
          </button>
        </li>
      ))}
    </ul>
  );
};

export default TodoList;
