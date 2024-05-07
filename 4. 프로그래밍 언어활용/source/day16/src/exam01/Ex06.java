package exam01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex06 {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Orange", "Melon", "Mango");

        String str = fruits.stream().collect(Collectors.joining(","));
        System.out.println(str);

        String str2 = fruits.stream().collect(Collectors.joining("#", "**", "^^"));
        System.out.println(str2);
    }
}
