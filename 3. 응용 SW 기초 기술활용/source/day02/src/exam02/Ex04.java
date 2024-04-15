package exam02;

import java.util.Arrays;

public class Ex04 {
    public static void main(String[] args) {
        String[] strs = {"가나", "다라", "마바"};

        for (String str : strs) { // 향상된 for문
            System.out.println(str);
        }


        //Arrays.stream(strs).forEach(System.out::println);

        /*
        for (int i = 0; i < strs.length; i++) {
            System.out.println(strs[i]);
        }

         */
    }
}
