package exam03;

public class Ex03 {
    public static void main(String[] args) {
        Runnable ex03_1 = new Ex03_1();
        Thread th = new Thread(ex03_1);
        // Thread run() 메서드에서 Ex03_1 run()메서드 실행
        th.start();

    }
}

class Ex03_1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("쓰레드2");
        }
    }
}
