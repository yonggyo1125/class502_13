package exam01;

public class Ex06 {
    public static void main(String[] args) {
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread th2 = Thread.currentThread();
                int num = 0;
                while(!th2.isInterrupted()) {
                    System.out.println(num++);

                    for(long j = 0; j < 1000000000L; j++);
                }
            }
        });

        th.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {}

        th.interrupt(); // isInterrupted() -> true
                        // interrupted() -> true
    }


}
