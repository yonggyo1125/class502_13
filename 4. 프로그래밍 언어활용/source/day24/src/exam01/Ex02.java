package exam01;

public class Ex02 {
    public static void main(String[] args) {
        Thread th = new Thread(new Ex02_1());
        th.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("메인 쓰레드 - " + i);
        }
    }
}

class Ex02_1 implements Runnable {

    @Override
    public void run() {
        // 실행중인 쓰레드 객체?
        Thread th = Thread.currentThread();

        for (int i = 0; i < 5; i++) {
            System.out.println(th.getName() + " - " + i);
        }
    }
}
