package exam02;

import java.util.Arrays;

public class Ex15 {
    public static void main(String[] args) {
        String str = "Apple  Mango      Melon Banana";
        String[] fruits = str.split("\\s+");
        System.out.println(Arrays.toString(fruits));
    }
}
