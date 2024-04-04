const todo = {
  /**
   * 스케줄 추가
   *
   */
  add() {
    const subject = frmRegist.subject.value;
    const liEl = document.createElement("li");
    liEl.appendChild(document.createTextNode(subject));

    const buttonEl = document.createElement("button");
    buttonEl.appendChild(document.createTextNode("삭제"));
    liEl.appendChild(buttonEl);

    const itemsEl = document.querySelector(".items");
    itemsEl.appendChild(liEl);
  },
  /**
   * 스케줄 삭제
   *
   */
  remove() {},
};

window.addEventListener("DOMContentLoaded", function () {
  frmRegist.addEventListener("submit", function (e) {
    e.preventDefault();
    todo.add(); // 스케줄 추가
  });
});
