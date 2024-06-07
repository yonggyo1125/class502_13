package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student(); // s1.id, s1.name
        s1.id = 1000;
        s1.name = "이이름";
        s1.subject = "과목1";

        System.out.println("s1:" + System.identityHashCode(s1));

        Student s2 = new Student();
        System.out.println("s2:" + System.identityHashCode(s2));

       // s1.study();
    }
}
