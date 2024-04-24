package exam03;

import java.util.Arrays;
import java.util.function.IntUnaryOperator;

public class Ex00 {
    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40 };
        int[] nums2 = Arrays.stream(nums).map(x -> x * x).toArray();
        System.out.println(Arrays.toString(nums2));

        /*
        Calculator cal = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };

        calc(cal);
         */
        calc(new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        });

        calc((a,b) -> a + b);
    }

    public static void calc(Calculator cal) {
        int result = cal.add(10, 20);
        System.out.println(result);
    }
}
