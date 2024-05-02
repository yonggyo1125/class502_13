package exam01;

import java.util.function.IntBinaryOperator;

public class Ex04 {
    public static void main(String[] args) {
        IntBinaryOperator calc = (a, b) -> a + b;
        int result = calc.applyAsInt(10, 20);
        System.out.println(result);
    }
}
