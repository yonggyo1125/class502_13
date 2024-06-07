package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Student s1 = new Student(); // s1.id, s1.name
        s1.id = 1000;
        s1.name = "이이름";
        s1.subject = "과목1";

        System.out.println("s1:" + System.identityHashCode(s1));

        Student s2 = new Student();
        s2.id=1001;
        s2.name = "김이름";
        s2.subject = "과목2";
        System.out.println("s2:" + System.identityHashCode(s2));

        s1.study();
        s2.study();

        Student s3 = s2; // s3에는 s2가 가지고 있는 주고 값이 대입

        System.out.println("s1 == s2:" + (s1 == s2));
        System.out.println("s2 == s3:" + (s2 == s3));

        s3.name = "박이름";
        System.out.println("s3:-----");
        s3.study();

        System.out.println("s2:-----");
        s2.study();
    }
}
