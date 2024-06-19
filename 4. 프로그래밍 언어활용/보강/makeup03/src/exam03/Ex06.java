package exam03;

import java.util.List;
import java.util.function.Function;

public class Ex06 {
    public static void main(String[] args) {
        List<String> fruits = List.of("사과", "배", "수박");
        List<String> fruits2 = fruits.stream().map(new Function<String, String>() {

            @Override
            public String apply(String s) {
                return "★" + s + "★";
            }
        }).toList();

        System.out.println(fruits2);

        List<String> fruits3 = fruits.stream().map(s -> "★" + s + "★").toList();

        System.out.println(fruits3);
    }
}
