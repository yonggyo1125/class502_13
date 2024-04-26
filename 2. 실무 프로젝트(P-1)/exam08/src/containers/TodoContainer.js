import { useState, useCallback } from "react";
import { connect } from "react-redux";
import { insert, remove } from "../modules/todo";
import Todo from "../components/Todo";

const TodoContainer = ({ todos, insert, remove }) => {
  const [todo, setTodo] = useState("");
  const onSubmit = useCallback((e) => {}, [todo]);

  const onChange = useCallback((e) => {
    setTodo(e.target.value);
  }, []);

  return <Todo />;
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
