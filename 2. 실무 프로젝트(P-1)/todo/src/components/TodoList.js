const TodoList = ({ todos }) => {
  return (
    <ul>
      {todos.map(({ id, title, done }) => (
        <li key={id}>{title}</li>
      ))}
    </ul>
  );
};

export default TodoList;
