package exam04;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

public class Ex14 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40};
        int[] nums2 = Arrays.stream(nums).map(x -> x * x).toArray();
    }
}
