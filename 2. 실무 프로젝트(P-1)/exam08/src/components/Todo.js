const Todo = ({ todos, onSubmit, onRemove }) => {
  return (
    <>
      <form onSubmit={onSubmit} autoComplete="off">
        <input type="text" name="todo" />
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
