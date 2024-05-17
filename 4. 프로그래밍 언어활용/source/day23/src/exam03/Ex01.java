package exam03;

public class Ex01 {
    public static void main(String[] args) { // + 호출 스택 : 메인쓰레드
        Ex01_1 th1 = new Ex01_1();

        // Thread run 메서드에서 Ex01_2 정의된 run만 실행
        Thread th2 = new Thread(new Ex01_2());

        th1.start();
        th2.start();

        System.out.println("메인쓰레드에서 실행!");
    }
}

class Ex01_2 implements Runnable {

    @Override
    public void run() {
        Thread th = Thread.currentThread(); // run이 실행될때 쓰레드
        for (int i = 0; i < 5; i++) {
            System.out.println(th.getName());

            for (long j = 0; j < 100000000L; j++);
        }
    }
}

class Ex01_1 extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName());

            for (long j = 0; j < 100000000L; j++);
        }
    }
}


