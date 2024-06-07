package exam01;

public class Student {
    int id; // 학번
    String name; // 학생명
    String subject; // 전공과목

    void study() {
        System.out.printf("id=%d, name=%s, subject=%s%n", id, name, subject);

        boolean result = true;
        if (result) {
            return;
        }

        System.out.println("실행2");
    }
}
