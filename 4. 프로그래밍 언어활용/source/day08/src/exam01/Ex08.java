package exam01;

import java.util.Arrays;

public class Ex08 {
    public static void main(String[] args) {
        sum(10, 20, 30, 40);
        sum(10, 20);
    }

    public static int sum(int... nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        return total;
    }
}
