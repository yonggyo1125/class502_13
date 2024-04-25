package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex03 {
    public static void main(String[] args) {
        String str = "123 a123 efg 12b3";
        Pattern p1 = Pattern.compile("[abc]");
        Matcher m1 = p1.matcher(str);
        if(m1.find()) {
            System.out.println(m1.group());
        }

        if (m1.find()) {
            System.out.println(m1.group());
        }

    }
}
