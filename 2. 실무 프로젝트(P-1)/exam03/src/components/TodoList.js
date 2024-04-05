import { MdCheckBox, MdCheckBoxOutlineBlank } from 'react-icons/md';
import { FaRegTrashCan } from 'react-icons/fa6';

const TodoList = ({ items, onToggle }) => {
  return (
    <ul>
      {items.map(({ id, title, done }) => (
        <li key={id}>
          <span onClick={() => onToggle(id)}>
            {done ? <MdCheckBox /> : <MdCheckBoxOutlineBlank />}
            {title}
          </span>
          <button type="button">
            <FaRegTrashCan />
          </button>
        </li>
      ))}
    </ul>
  );
};

export default TodoList;
