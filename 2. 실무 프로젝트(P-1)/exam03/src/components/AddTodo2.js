import { MdOutlineAdd } from 'react-icons/md';

const AddTodo = ({ onSubmit, state, dispatch }) => {
  return (
    <form onSubmit={onSubmit} autoComplete="off">
      <input
        type="text"
        value={state.todo}
        onChange={dispatch({ type: 'INPUT' })}
      />
      <button type="submit">
        <MdOutlineAdd />
      </button>
    </form>
  );
};

export default AddTodo;
