package exam01;

public class Ex01 {
    public static void main(String[] args) {
        // s1 - 지역 변수 - 스택 영역
        Student s1 = new Student();

        // 멤버 변수, 인스턴스 변수 - 힙 영역
        s1.id = 1000;
        s1.name = "이이름";
        s1.subject = "과목1";

       // s1.study();
        System.out.println(System.identityHashCode(s1));
    }
}
