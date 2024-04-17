package exam02;

public class Student {
    public static int id;
    private String name = "이이름";
    private String subject;

    public Student() {}

    public Student(int id, String name, String subject) {
        this.id = id;
        this.name = name;
        this.subject = subject;
    }

    public static void staticMethod() {
        // 객체와 상관 없이 사용 가능, this 지역 변수 X -> 객체의 자원 접근 X
        // 정적 자원만 접근 가능(static 변수, 메서드)
        System.out.println("정적 메서드!!");
        //this.name = "이이름";
        //this.instanceMethod();
        id = 1000;
    }

    public void instanceMethod() { // this 지역변수 O : 객체 자원 접근
        System.out.println("인스턴스 메서드!!");
        System.out.println(this.name);

        // 정적 자원은 객체 생성 이전부터 존재
        staticMethod();
        id = 1000;

    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
