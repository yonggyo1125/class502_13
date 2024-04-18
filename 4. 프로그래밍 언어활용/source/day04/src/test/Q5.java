package test;

import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        int[] nums = { 21, 22, 30,  11, 99, 31 };

        //int index = nums.length - 2 - 1;

        for (int i = 0; i < nums.length / 2; i++) {
            int index = nums.length - i - 1;
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }

        System.out.println(Arrays.toString(nums));
    }
}
