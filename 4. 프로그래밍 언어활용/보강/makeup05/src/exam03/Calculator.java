package exam03;

public interface Calculator {
    int num = 10; // public static final
    int add(int num1, int num2); // public abstract

    default int minus(int num1, int num2) {
        return num1 - num2;
    }
    static void staticMethod() {

    }

}
