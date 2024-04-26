const Todo = ({ todos, todo, onSubmit, onChange, onRemove }) => {
  return (
    <>
      <form onSubmit={onSubmit} autoComplete="off">
        <input type="text" name="todo" value={todo} onChange={onChange} />
        <button type="submit">등록</button>
      </form>
      <ul>
        {todos.map(({ id, todo }) => (
          <li key={id}>
            {todo}
            <button type="button" onClick={() => onRemove(id)}>
              삭제
            </button>
          </li>
        ))}
      </ul>
    </>
  );
};

export default Todo;
