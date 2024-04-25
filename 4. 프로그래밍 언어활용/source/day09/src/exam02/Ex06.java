package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex06 {
    public static void main(String[] args) {
        String str = "java I like java and javascript";
        //Pattern p1 = Pattern.compile("\\bjava\\b");
        Pattern p1 = Pattern.compile("\\bjava\\B");
        Matcher m1 = p1.matcher(str);
        if (m1.find()) {
            System.out.println(m1.group());
        }

        if (m1.find()) {
            System.out.println(m1.group());
        }

        m1.find();
        System.out.println(m1.group());
    }
}
