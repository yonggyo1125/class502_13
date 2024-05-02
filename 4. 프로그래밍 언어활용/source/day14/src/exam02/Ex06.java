package exam02;

import java.util.function.IntUnaryOperator;

public class Ex06 {
    public static void main(String[] args) {

    }

    public static int[] map(int[] nums, IntUnaryOperator oper) {
        int[] newNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newNums[i] = oper.applyAsInt(nums[i]);
        }

        return newNums;
    }
}
