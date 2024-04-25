package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex02 {
    public static void main(String[] args) {
        String str = "I like java and javascript";

        Pattern p1 = Pattern.compile("java");
        Matcher m1 = p1.matcher(str);
        boolean match = m1.matches();
        System.out.println(match);
    }
}
