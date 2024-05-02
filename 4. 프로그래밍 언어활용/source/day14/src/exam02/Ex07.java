package exam02;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

public class Ex07 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int[] nums2 = map(nums, x -> x * x);

        System.out.println(Arrays.toString(nums2));
    }
    public static int[] map(int[] nums, IntUnaryOperator oper) {
        int[] newNums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            newNums[i] = oper.applyAsInt(nums[i]);
        }

        return newNums;
    }
}
