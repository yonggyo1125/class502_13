package exam04;

import java.util.stream.IntStream;

public class Ex07 {
    public static void main(String[] args) {
        int total = IntStream.rangeClosed(1, 100).sum();
    }
}
