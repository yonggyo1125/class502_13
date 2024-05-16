package exam02;

public class Ex01 {
    public static void main(String[] args) {
        EventEmiter eventEmiter = new EventEmiter();
        eventEmiter.addListener("click", () -> System.out.println("클릭 처리..."));

        eventEmiter.emit("click"); // 이벤트 발생
    }
}
