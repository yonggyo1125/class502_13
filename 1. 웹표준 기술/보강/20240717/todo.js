const todos = {
  // 스케줄 추가
  add(todo) {},
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
