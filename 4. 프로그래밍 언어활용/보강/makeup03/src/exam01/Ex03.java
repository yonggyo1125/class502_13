package exam01;

public class Ex03 {
    public static void main(String[] args) {
        Student s1 = new Student(1000, "이름1", "과목1");
        s1.instantMethod(); // 인스턴스 메서드 호출 시에는 이미 객체 생성 상태
    }
}
