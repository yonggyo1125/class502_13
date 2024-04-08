const todo = {
  data: [],
  init() {
    // 처음 DOM 로딩 완료 후 실행될 메서드 - localStorage 저장된 데이터 조회, li 태그 완료
    const jsonData = localStorage.getItem("todos");
    const todos = jsonData ? JSON.parse(jsonData) : [];
    this.data = todos;

    const itemsEl = document.querySelector(".items");

    for (const subject of todos) {
      const liEl = this.getItem(subject);
      itemsEl.appendChild(liEl);
    }
  },
  // 스케줄 추가
  add() {
    const subject = frmRegist.subject.value;
    const liEl = this.getItem(subject);
    const itemsEl = document.querySelector(".items");
    itemsEl.appendChild(liEl);

    this.data.push(subject);
    this.save();
  },
  save() {
    localStorage.setItem("todos", JSON.stringify(this.data));
  },
  getItem(subject) {
    const liEl = document.createElement("li");
    const textEl = document.createTextNode(subject);
    const buttonEl = document.createElement("button");
    buttonEl.type = "button";
    buttonEl.appendChild(document.createTextNode("삭제"));

    liEl.appendChild(textEl);
    liEl.appendChild(buttonEl);

    buttonEl.addEventListener("click", function () {
      const parentEl = liEl.parentElement;
      parentEl.removeChild(liEl);
    });

    return liEl;
  },
};

window.addEventListener("DOMContentLoaded", function () {
  todo.init();

  // DOM 완성
  frmRegist.addEventListener("submit", function (e) {
    e.preventDefault();

    todo.add();
  });
});
