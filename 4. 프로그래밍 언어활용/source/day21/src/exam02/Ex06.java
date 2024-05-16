package exam02;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;

public class Ex06 {
    public static void main(String[] args) {
        //BiFunction<Integer, Integer, Integer> calc = (a, b) -> a + b;
        //BinaryOperator<Integer> calc = (a, b) -> a + b;
        IntBinaryOperator calc = (a, b) -> a + b;
        int result = calc.applyAsInt(10, 20);
        System.out.println(result);
    }
}
