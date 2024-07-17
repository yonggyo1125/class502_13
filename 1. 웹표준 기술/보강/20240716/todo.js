const todos = {
  // 스케줄 추가
  add(todo) {
    todo = todo ?? "";
    todo = todo.trim();

    if (!todo) {
      throw new Error("스케줄을 입력하세요.");
    }

    const liEl = document.createElement("li");
    liEl.append(todo);

    const schedulesEl = document.getElementById("schedules");
    schedulesEl.append(liEl);
  },
  // 스케줄 제거
  remove() {},
};

window.addEventListener("DOMContentLoaded", function () {
  frmRegist.addEventListener("submit", function (e) {
    e.preventDefault();

    const todoEl = this.todo;

    try {
      todos.add(todoEl.value); // 스케줄 등록

      todoEl.value = "";
      
    } catch (e) {
      alert(e.message);git 
    }

    todoEl.focus();
  });
});
