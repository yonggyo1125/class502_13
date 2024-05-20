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
    }
}


