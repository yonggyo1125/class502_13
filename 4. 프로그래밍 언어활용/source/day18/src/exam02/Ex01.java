package exam02;

import java.time.LocalDate;

public class Ex01 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate startDate = LocalDate.of(today.getYear(), today.getMonth(), 1);

        int yoil = startDate.getDayOfWeek().getValue(); // 1(월)~7(일)
        // 요일을 0(일)~6(토)  -> yoil % 7
        System.out.println(yoil);

        LocalDate endDate = startDate.plusMonths(1).minusDays(1);
        System.out.println(endDate);

    }
}
