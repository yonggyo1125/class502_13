package exam02;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Ex04 {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("aa", "bb", "cc");
        strs.stream().map(s -> s.toUpperCase());
    }


}
