package exam02;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;

public class Ex03 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        /*
        IntUnaryOperator oper = new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return operand * operand;
            }
        };
        */

        int[] nums2 = Arrays.stream(nums)
                .filter(x -> x % 2 == 1)
                .map(x -> x * x).toArray();
        System.out.println(Arrays.toString(nums2));

    }
}
