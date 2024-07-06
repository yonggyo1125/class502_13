package exam01;

public abstract class Calculator {

    final int num1 = 10; // 멤버 변수 - 객체 생성시에 공간을 할당


    public Calculator() {
        System.out.println("Calculator 생성자!");
    }

    public final void commonMethod() {
        System.out.println("공통 인스턴스 메서드");
    }

    // 표준 설계 원칙
    public abstract int add(int num1, int num2); // 추상 메서드
}
