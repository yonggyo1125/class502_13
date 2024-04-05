import { FiPlus } from 'react-icons/fi';
const AddTodo = () => {
  return (
    <form autoComplete="off">
      <input type="text" />
      <button type="submit">
        <FiPlus />
      </button>
    </form>
  );
};

export default AddTodo;
