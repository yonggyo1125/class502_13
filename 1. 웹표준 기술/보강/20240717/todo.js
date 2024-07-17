const todos = {
  // 템플릿 가져오기
  getTpl() {
    const tplEl = document.getElementById("tpl");

    return tplEl.innerHTML;
  },
  // 스케줄 추가
  add(todo) {
    todo = todo ?? "";
    todo = todo.trim();
    if (!todo) {
      throw new Error("스케줄을 입력하세요.");
    }

    let html = this.getTpl();
    html = html.replace(/#todo#/g, todo);

    const domParser = new DOMParser();
    const dom = domParser.parseFromString(html, "text/html");
    const liEl = dom.querySelector("li");

    const schedulesEl = document.getElementById("schedules");
    schedulesEl.append(liEl);

    const buttonEl = liEl.querySelector("button");
    buttonEl.addEventListener("click", function () {
      if (confirm("정말 삭제하겠습니까?")) {
        liEl.remove();
      }
    });
  },
};

window.addEventListener("DOMContentLoaded", function () {
  frmTodo.addEventListener("submit", function (e) {
    e.preventDefault();

    const todoEl = this.todo;

    try {
      todos.add(todoEl.value);

      todoEl.value = "";
    } catch (err) {
      alert(err.message);
    }

    todoEl.focus();
  });
});
