package exam03;

public class Ex02 {
    public static void main(String[] args) {
        Ex02_1 th1 = new Ex02_1();
        th1.start();
    }
}

class Ex02_1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("쓰레드1");
        }
    }
}