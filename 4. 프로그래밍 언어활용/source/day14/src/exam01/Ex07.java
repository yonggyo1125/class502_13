package exam01;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntFunction;

public class Ex07 {
    public static void main(String[] args) {
        ToIntFunction<String> func1 = s -> s.length();
        ToIntFunction<String> func2 = String::length;

        BiPredicate<String, String> cond1 = (s1, s2) -> s1.equals(s2);
        BiPredicate<String, String> cond2 = String::equals;
    }
}
