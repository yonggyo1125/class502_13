import { useState, useCallback } from "react";
import { connect } from "react-redux";
import { insert, remove } from "../modules/todo";
import Todo from "../components/Todo";

const TodoContainer = ({ todos, insert, remove }) => {
  const [todo, setTodo] = useState("");
  const onSubmit = useCallback(
    (e) => {
      e.preventDefault();
      insert(todo);
    },
    [todo, insert]
  );

  const onChange = useCallback((e) => {
    setTodo(e.target.value);
  }, []);

  return (
    <Todo
      todos={todos}
      todo={todo}
      onSubmit={onSubmit}
      onChange={onChange}
      onRemove={remove}
    />
  );
};

export default connect(
  ({ todo }) => ({
    todos: todo,
  }),
  {
    insert,
    remove,
  }
)(TodoContainer);
