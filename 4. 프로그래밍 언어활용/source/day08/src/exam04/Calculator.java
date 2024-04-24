package exam04;

public abstract class Calculator {
    private int num;
    public Calculator(int num) {
        this.num = num;
    }

    public abstract int add(int num1, int num2);
}
