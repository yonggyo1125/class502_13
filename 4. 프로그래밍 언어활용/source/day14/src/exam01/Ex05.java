package exam01;

import java.util.function.Function;

public class Ex05 {
    public static void main(String[] args) {
        Function<String, Integer> func1 = s -> s.length();
        Function<Integer, Integer> func2 = x -> x * x;
        Function<String, Integer> func3 = func1.andThen(func2);
        Function<String, Integer> func4 = func2.compose(func1); // func1 -> func2
        int num = func4.apply("가나다");  // 가나다 -> 3 -> 9
        System.out.println(num);

        //int len = func1.apply("가나다");
        //System.out.println(len);
    }
}
