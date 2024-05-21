package exam01;

public class Ex08 {
    public static void main(String[] args) throws InterruptedException {
        Ex08_1 th1 = new Ex08_1("*");
        Ex08_1 th2 = new Ex08_1("**");
        Ex08_1 th3 = new Ex08_1("***");

        th1.start();
        th2.start();
        th3.start();

        Thread.sleep(2000);
        th1.suspend(); // 일시 정지

        Thread.sleep(2000);
        th2.suspend(); // 일시 정지

        Thread.sleep(3000);
        th1.stop(); // 정지(종료)
        th2.stop(); // 정지(종료)

        Thread.sleep(2000);
        th3.stop(); // 정지(종료)

    }
}

class Ex08_1 implements Runnable {

    private volatile boolean stopped = false; // 정지 X
    private volatile boolean suspended = false; // 일시정지 X

    private Thread th;

    public Ex08_1(String name) {
        th = new Thread(this, name);
    }

    @Override
    public void run() {
        while(!stopped) {
            if (!suspended) {
                System.out.println(th.getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("interrupted");
                }
            } else { // 일시 정지 상태 -> 다른 쓰레드로 바로 작업 양보
                th.yield();
            }
        }
    }

    public void start() {
        th.start();
    }

    public void suspend() {
        suspended = true; // 일시 정지
        th.interrupt();
        System.out.println("suspend - interrupted");
    }

    public void resume() {
        suspended = false;
    }

    public void stop() {
        stopped = true;
        System.out.println("stop - interrupted");
    }
}
