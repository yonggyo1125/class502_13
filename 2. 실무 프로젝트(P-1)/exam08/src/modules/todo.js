// 1. 액션명
const INSERT = "todo/INSERT";
const REMOVE = "todo/REMOVE";

// 2. 액션 객체 생성 함수
export const insert = (todo) => ({ type: INSERT, todo });
export const remove = (id) => ({ type: REMOVE, id });

// 3. 리듀서 함수

const initialValue = [
  {
    id: 1,
    todo: "할일1",
  },
  {
    id: 2,
    todo: "할일2",
  },
  {
    id: 3,
    todo: "할일3",
  },
];

function todo(state = initialValue, action) {
  switch (action.type) {
    case INSERT:
      const id = state.length > 0 ? state[state.length - 1].id + 1 : 1;
      return state.concat({ id, todo: action.todo });
    case REMOVE:
      return state.filter((todo) => todo.id !== action.id);
    default:
      return state;
  }
}

export default todo;
