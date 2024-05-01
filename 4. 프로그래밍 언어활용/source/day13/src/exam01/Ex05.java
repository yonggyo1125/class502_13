package exam01;

import java.util.Arrays;

public class Ex05 {
    public static void main(String[] args) {
        char[] chars = new char[10];
        Arrays.fill(chars, '*');
        System.out.println(Arrays.toString(chars));

        // user01 -> use***
        String userId = "user01";
        char[] chars2 = userId.toCharArray();
        Arrays.fill(chars2, 3, userId.length(), '*');
        System.out.println(Arrays.toString(chars2));
        userId = String.valueOf(chars2);
        System.out.println(userId);
    }
}
