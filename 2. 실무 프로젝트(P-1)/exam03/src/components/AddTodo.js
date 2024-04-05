import { useEffect } from 'react';
import { MdOutlineAdd } from 'react-icons/md';


const AddTodo = ({ onSubmit, onChange, todo, message }) => {

  useEffect(() => {
    console.log("todo 값 변경 - 렌더링 후");

  }, [todo]) // [...] // 변화 감지 기준 

  return (
    <form onSubmit={onSubmit} autoComplete="off">
      <input type="text" value={todo ?? ''} onChange={onChange} />
      <button type="submit">
        <MdOutlineAdd />
      </button>

      {message && <div>{message}</div>}
    </form>
  );
};

export default AddTodo;
