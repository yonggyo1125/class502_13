package exam03;

import java.text.MessageFormat;

public class Ex06 {
    public static void main(String[] args) {
        String pattern = "이름:{0}, 전화번호:{1}";

        String[] names = {"이이름", "김이름", "최이름"};
        String[] mobiles = {"010-0000-0000", "010-1000-1000", "010-2000-2000"};

        for (int i = 0; i < names.length; i++) {
            String str = MessageFormat.format(pattern, names[i], mobiles[i]);
            System.out.println(str);
        }
    }
}
