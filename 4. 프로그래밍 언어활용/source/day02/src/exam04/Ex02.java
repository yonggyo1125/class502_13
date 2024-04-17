package exam04;

public class Ex02 {
    public static void main(String[] args) {
        Student s1 = new Student(1000, "이이름", "자바");
        // s1 - 참조변수, Student : 참조 자료형

        s1.study();

        Student s2 = new Student(1001, "김이름", "리액트");
        s2.study();
       // s1 = null;
       // s1.study();
        //System.out.println(System.identityHashCode(s1));
    }
}
