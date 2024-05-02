package exam02;

import java.util.Arrays;
import java.util.List;

public class Ex04 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "orange", "mango", "melon");
        fruits.stream().map(s -> "*" + s + "*")
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println(fruits);
    }
}
