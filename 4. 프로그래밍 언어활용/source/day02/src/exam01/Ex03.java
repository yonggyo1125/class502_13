package exam01;

public class Ex03 {
    public static void main(String[] args) {
        Student s1 = new Student(1000, "이이름", "자바");
        s1.study(); // 함수가 실행되려면 우선 객체가 먼저 생성되어야 한다.

        Student s2 = new Student(1001, "김이름", "리액트");
        s2.study();
       // System.out.println(System.identityHashCode(s1));
    }
}
