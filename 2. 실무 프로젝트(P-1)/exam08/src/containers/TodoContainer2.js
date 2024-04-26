import React, { useState, useCallback } from "react";
import { useSelector, useDispatch } from "react-redux";
import { insert, remove } from "../modules/todo";
import Todo from "../components/Todo";

const TodoContainer = () => {
  const [todo, setTodo] = useState("");

  const todos = useSelector((state) => state.todo);
  const dispatch = useDispatch();
  const onInsert = useCallback((todo) => dispatch(insert(todo)), [dispatch]);
  const onRemove = useCallback((id) => dispatch(remove(id)), [dispatch]);

  const onSubmit = useCallback(
    (e) => {
      e.preventDefault();
      onInsert(todo);
    },
    [todo, onInsert]
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
      onRemove={onRemove}
    />
  );
};

export default React.memo(TodoContainer);
