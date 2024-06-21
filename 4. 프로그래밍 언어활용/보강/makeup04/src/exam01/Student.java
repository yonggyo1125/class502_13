package exam01;

public class Student {
    int id; // 학번
    String name; // 학생명
    String subject; // 전공 과목

    public Student() {
        // 객체가 생성되면 실행되는 코드
        // 여기 정의된 코드가 실행되는 시점? 객체 이미 생성된 시점
        // 이미 객체가 되어 있으므로 id, name, subject는 변수가 되어 있다.
        id = 1000;
        name = "이이름";
        subject = "과목";
    }

    void showInfo() {
        System.out.printf("id=%d, name=%s, subject=%s%n", id, name, subject);
    }
}
