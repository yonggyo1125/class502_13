package exam01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex05 {
    public static void main(String[] args) {
        String strDate = "05/09/24 15:16";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yy HH:mm");
        LocalDateTime date = LocalDateTime.parse(strDate, formatter);
        System.out.println(date);
    }
}
