package exam02;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Ex04 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        DayOfWeek dayOfWeek = today.getDayOfWeek();

        String yoilStr = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.KOREAN);
        System.out.println(yoilStr);

        String yoilStr2 = dayOfWeek.getDisplayName(TextStyle.SHORT, Locale.KOREAN);
        System.out.println(yoilStr2);
    }
}
