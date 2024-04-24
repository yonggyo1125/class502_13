package exam04;

import java.util.Arrays;

public class Ex06 {
    public static void main(String[] args) {
        int[][] nums1 = {{10, 20, 30}, {40,50,60}};
        int[][] nums2 = {{10, 20, 30}, {40, 55, 60}};
        boolean isSame = Arrays.deepEquals(nums1, nums2);
        System.out.println(isSame);
    }
}
