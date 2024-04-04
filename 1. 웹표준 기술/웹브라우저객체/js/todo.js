const todo = {
  /**
   * 스케줄 추가
   *
   */
  add() {
    const subject = frmRegist.subject.value;

    if (!subject.trim()) { // 좌우 공백 제거
      alert("할일을 입력하세요.");
      return;
    }

    const liEl = document.createElement("li");
    liEl.appendChild(document.createTextNode(subject));

    const buttonEl = document.createElement("button");
    buttonEl.appendChild(document.createTextNode("삭제"));
    liEl.appendChild(buttonEl);

    const itemsEl = document.querySelector(".items");
    itemsEl.appendChild(liEl);

    // 스케줄 삭제
    buttonEl.addEventListener("click", function () {
      itemsEl.removeChild(liEl);
    });

    frmRegist.subject.value = "";
    frmRegist.subject.focus();
  },
};

window.addEventListener("DOMContentLoaded", function () {
  frmRegist.addEventListener("submit", function (e) {
    e.preventDefault();
    todo.add(); // 스케줄 추가
  });
});
