package exam03;

import java.util.Arrays;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {
        //List<Integer> nums = Arrays.asList(10, 20, 30, 40, 50, 60);
        // Stream<Integer> -> mapToInt -> IntStream
        //long total = nums.stream().mapToInt(x -> x.intValue()).sum();
        int[] nums = { 10, 20, 30, 40, 50, 60 };
        // IntStream
        long total = Arrays.stream(nums).sum();

    }
}
