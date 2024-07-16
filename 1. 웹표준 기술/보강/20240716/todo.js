window.addEventListener("DOMContentLoaded", function () {
  frmRegist.addEventListener("submit", function (e) {
    e.preventDefault();

    const todo = this.todo.value.trim();

    const liEl = document.createElement("li");
    liEl.appendChild(document.createTextNode(todo));

    const schedulesEl = document.getElementById("schedules");
    schedulesEl.appendChild(liEl);
  });
});
