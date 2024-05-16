package exam02;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

public class Ex02 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3, 3, 3, 4, 5, 6,7,8,9,10};

        int total = Arrays.stream(nums).distinct().peek(x -> System.out.println(x)).filter(x -> x % 2 == 1).sum();
    }
}
