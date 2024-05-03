package exam01;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex06 {
    public static void main(String[] args) {
        IntStream stm1 = IntStream.rangeClosed(1, 50);
        IntStream stm2 = IntStream.rangeClosed(51, 100);
        IntStream stm = IntStream.concat(stm1, stm2); // 1~100
        int[] nums = stm.toArray();
        System.out.println(Arrays.toString(nums));
    }
}
