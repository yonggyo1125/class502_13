package exam02;

import java.util.stream.IntStream;

public class Ex13 {
    public static void main(String[] args) {
        /*
        for (int i = 0; i < 10; i++) {
            System.out.println("반복" + i);
        }
         */

        IntStream.range(0, 10).forEach(i -> System.out.println("반복" + i));

    }
}
