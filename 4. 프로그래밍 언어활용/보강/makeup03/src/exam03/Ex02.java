package exam03;

public class Ex02 {
    public static void main(String[] args) {
        C c = new C(); // 하위 클래스가 상위 클래스의 자료형으로 자동 형변환(다형성)

        A a = c;
        B b = c;

    }
}
