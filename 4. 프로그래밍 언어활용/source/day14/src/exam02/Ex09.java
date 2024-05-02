package exam02;

import java.util.stream.Stream;

public class Ex09 {
    public static void main(String[] args) {
        long cnt = Stream.of("이름1", "이름2", "이름3").count();
        System.out.println(cnt);
    }
}
