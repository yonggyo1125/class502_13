package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ex01 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("이름1", "이름2", "이름3", "이름4");
        names.forEach(s -> System.out.println(s));
    }
}
