package exam01;

public class Ex02 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1000;
        s1.name = "학생1";
        s1.subject = "과목1";

        s1.showInfo();

        Student s2 = s1; // s2에는 s1이 가지고 있는 값(객체의 주소값)을 대입

        s2.name = "학생2";
        s2.showInfo();
        s1.showInfo();

        System.out.println("s1:" + System.identityHashCode(s1));
        System.out.println("s2:" + System.identityHashCode(s2));
    }
}
