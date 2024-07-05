package exam02;

public abstract class Calculator {
    public int num1 = 10;

    public abstract int add(int num1, int num2); // 메서드의 정의
    public Calculator() {
        System.out.println("Calculator 생성자");
    }

    public void instantMethod() {
        System.out.println("instant Method");
    }
}
