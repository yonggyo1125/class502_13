import { MdOutlineAdd } from 'react-icons/md';

const AddTodo = () => {
  return (
    <form autoComplete="off">
      <input type="text" />
      <button type="submit">
        <MdOutlineAdd />
      </button>
    </form>
  );
};

export default AddTodo;
