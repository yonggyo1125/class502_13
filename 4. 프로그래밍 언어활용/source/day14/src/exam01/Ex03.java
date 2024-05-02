package exam01;

import java.util.function.BinaryOperator;

public class Ex03 {
    public static void main(String[] args) {
        BinaryOperator<Integer> calc = (a, b) -> a + b;
        int result = calc.apply(10, 20);
        System.out.println(result);
    }
}
