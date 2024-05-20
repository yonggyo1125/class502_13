package exam01;

public class Ex04 {
    public static void main(String[] args) {
        Runnable r1 = () -> {
            for (int i = 0; i < 300; i++) {
                System.out.print("-");

                for (long j = 0; j < 100000000L; j++);
            }
        };

        Runnable r2 = () -> {
            for (int i = 0; i < 300; i++) {
                System.out.print("=");

                for (long j = 0; j < 100000000L; j++);
            }
        };

        Thread th1 = new Thread(r1);
        Thread th2 = new Thread(r2);
        System.out.printf("th1:%d, th2:%d%n", th1.getPriority(), th2.getPriority());

        th1.start();
        th2.start();
    }
}


