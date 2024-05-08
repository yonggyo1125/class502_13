package exam02;

import java.time.LocalDate;

public class Ex01 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate date = LocalDate.of(2023, 5, 8);
        System.out.println(date);
    }
}
