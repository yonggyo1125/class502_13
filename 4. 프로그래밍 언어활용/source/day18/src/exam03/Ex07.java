package exam03;

import java.text.MessageFormat;
import java.text.ParseException;

public class Ex07 {
    public static void main(String[] args) throws ParseException {
        String str = "이름: 이이름, 전화번호: 010-0000-0000";
        String pattern = "이름: {0}, 전화번호: {1}";

        MessageFormat mf = new MessageFormat(pattern);
        Object[] data = mf.parse(str);

        String name = (String)data[0];
        String mobile = (String)data[1];

        System.out.println(name);
        System.out.println(mobile);
    }
}
