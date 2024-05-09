package exam01;

import java.time.Instant;

public class Ex01 {
    public static void main(String[] args) {
        Instant today = Instant.now();
        System.out.println(today);

        long time1 = today.getEpochSecond(); // 초단위 - Timestamp
        long time2 = today.toEpochMilli(); // 밀리초 단위 - EpochTime, UID

        System.out.printf("time1=%d, time2=%d%n", time1, time2);

    }
}
