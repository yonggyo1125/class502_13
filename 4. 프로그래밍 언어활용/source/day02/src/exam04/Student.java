package exam04;

public class Student {
    int id;
    String name;
    String subject;

    public Student() {

    }

    public Student(int _id, String _name, String _subject) {
        // 객체 생성 이후에 수행될 코드 .. id, name, subject - 변수 공간 할당
        id = _id;
        name = _name;
        subject = _subject;
    }

    void study() {
        System.out.printf("id=%d, name=%s, subject=%s%n", id, name, subject);
    }
}
