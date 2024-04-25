package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex10 {
    public static void main(String[] args) {
        //String str = "cat|dog|pig";
        String str = "I like a dog";
        Pattern p1 = Pattern.compile("cat|dog|pig");
        Matcher m1 = p1.matcher(str);
        if (m1.find()) {
            System.out.println(m1.group());
        }
    }
}
