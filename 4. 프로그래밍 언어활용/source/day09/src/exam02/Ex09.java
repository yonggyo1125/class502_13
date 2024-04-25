package exam02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex09 {
    public static void main(String[] args) {
        String mobile = "01034812101";
        System.out.println(checkMobile(mobile));
    }

    public static boolean checkMobile(String mobile) {
        /**
         * 010-0000-0000
         * 011-000-0000
         * 016-000-0000
         */

        Pattern pattern = Pattern.compile("^01[016]\\D*\\d{3,4}\\D*\\d{4}$");
        Matcher matcher = pattern.matcher(mobile);

        boolean matched = matcher.find();

        return matched;
    }
}
