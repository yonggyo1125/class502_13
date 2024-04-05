import { useReducer } from 'react';
import AddTodo from '../components/AddTodo2';
import TodoList from '../components/TodoList2';

const items = [
  { id: 1, title: '할일1', done: true },
  { id: 2, title: '할일2', done: false },
  { id: 3, title: '할일3', done: false },
];

const todo = '';

function reducer(state, action) {
  // state : 현재 상태값, action - 액션 발생 함수에서 넘겨준 값
  console.log(state, action);
}

const TodoContainer2 = () => {
  // state - 현재 상태값, dispatch - 액션 발생 함수

  return (
    <>
      <AddTodo />
      <TodoList />
    </>
  );
};

export default TodoContainer2;
