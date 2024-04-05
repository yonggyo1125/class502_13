import AddTodo from "../components/AddTodo";
import TodoList from "../components/TodoList";


const intialValue = [
    { id: 1, title: '할일1', done: true },
    { id: 2, title: '할일2', done: false },
    { id: 3, title: '할일3', done: false },
  ];

function reducer(state, action) { // state : 현재 상태값, action - 액션 발생 함수에서 넘겨준 값

}

const TodoContainer2 = () => {
    return (
        <>
            <AddTodo />
            <TodoList />
        </>
    );
};

export default TodoContainer2;