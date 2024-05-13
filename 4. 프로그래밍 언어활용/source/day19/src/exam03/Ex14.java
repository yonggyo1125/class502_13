package exam03;

public class Ex14 {
    public static void main(String[] args) {
        Ex14_1 th1 = new Ex14_1("*");
        Ex14_1 th2 = new Ex14_1("**");
        Ex14_1 th3 = new Ex14_1("***");
        th1.start();
        th2.start();
        th3.start();

        try {
            Thread.sleep(2000);
            th1.suspend();
            Thread.sleep(2000);
            th2.suspend();
            Thread.sleep(3000);
            th1.resume();
            Thread.sleep(3000);
            th1.stop();
            th2.stop();
            Thread.sleep(2000);
            th3.stop();
        } catch (InterruptedException e) {

        }

    }
}


class Ex14_1 implements Runnable {
    volatile boolean suspended = false;
    volatile boolean stopped = false;

    Thread th;

    Ex14_1(String name) {
        th = new Thread(this, name);
    }

    public void run() {
        String name = th.getName();
        while(!stopped) {
            if (!suspended) {
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    System.out.println(name + " - interrutped");
                }
            } else { // 정지상태이면 다른 쓰레드로 바로 양보한다(넘긴다) - 응답성 향상
                Thread.yield();
            }
        }
        System.out.println(Thread.currentThread().getName() + " - stopped");
    }

    public void suspend() {
        suspended = true;
        th.interrupt();
        System.out.println(th.getName() + " - interrupt() by suspend()");
    }

    public void resume() {
        suspended = false;
    }

    public void stop() {
        stopped = true;
        th.interrupt();
        System.out.println(th.getName() + " - interrupted() by stop()");
    }

    public void start() {
        th.start();
    }
}