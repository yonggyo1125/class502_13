package exam01;

import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        int[] scores = { 67, 80, 100, 98, 76, 56 };

        int max = Arrays.stream(scores)
                    .reduce((a, b) -> {
                        System.out.printf("a=%d, b=%d%n", a, b);

                        int m = a > b ? a : b;
                        return m;
                    })
                    .getAsInt();
        System.out.println(max);
    }
}
