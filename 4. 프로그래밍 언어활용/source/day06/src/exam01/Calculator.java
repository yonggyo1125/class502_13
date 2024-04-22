package exam01;

public abstract class Calculator {
    int num = 10;

    public Calculator() {
        System.out.println("Calculator 생성자!");
    }

    public abstract int add(int num1, int num2);

    public final void commonMethod() {

    }
}