package exam03;

public class Ex16 {
    static long startTime = 0;

    public static void main(String[] args) {
        Ex16_1 th1 = new Ex16_1();
        Ex16_2 th2 = new Ex16_2();
        th1.start();
        th2.start();
        startTime = System.currentTimeMillis();

        try {
            th1.join(); // main쓰레드가  th1의 작업이 끝날 때까지 기다린다.
            th2.join(); // main쓰레드가 th2의 작업이 끝날 때까지 기다린다.
        } catch (InterruptedException e) {}

        System.out.print("소요시간:" + (System.currentTimeMillis() - Ex16.startTime));
    }
}

class Ex16_1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            System.out.println("-");
        }
    }
}

class Ex16_2 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            System.out.println("|");
        }
    }
}