package exam01;

public class Student {
    int id; // 학번
    String name; // 이름
    String subject; // 과목

    void study() {
        System.out.printf("%s가 %s를 공부한다.%n", name, subject);

    }
}
