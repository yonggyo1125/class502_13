package exam01;

import java.time.LocalDate;
import java.time.Period;

public class Ex02 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate endDate = LocalDate.of(2024, 9, 30);

        Period period = Period.between(today, endDate);
        int month = period.getMonths();
        int day = period.getDays();
        System.out.printf("남은 수업 : %d개월, %d일%n", month, day);
    }
}
