package exam04;

import java.util.Optional;

public class Ex02 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 2;
            int result = num1 / num2; // throw new ...
            System.out.println(result);

            //Optional<String> opt = Optional.ofNullable(null);
            //String str = opt.isPresent() ? opt.get().toUpperCase() : null;
            String str = null;
            str.toUpperCase();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("유입1");

        }

        System.out.println("실행!");
    }
}
