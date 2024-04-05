import { MdCheckBox, MdCheckBoxOutlineBlank } from 'react-icons/md';
import { FaRegTrashCan } from 'react-icons/fa6';

const TodoList = ({ items }) => {
  return (
    <ul>
      {items.map(({ id, title, done }) => (
        <li key={id}>
          <span>
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
