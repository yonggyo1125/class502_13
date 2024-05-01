package exam03;

import java.util.function.BiFunction;

public class Ex01 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> calc = (a, b) -> a + b;
        int result = calc.apply(10, 20);
        System.out.println(result);
    }
}
