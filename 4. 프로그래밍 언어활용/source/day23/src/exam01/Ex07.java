package exam01;

public class Ex07 {
    private static boolean autoSave = false;

    public static void main(String[] args) throws InterruptedException {
        Thread th = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                }

                System.out.println("저장!");
            }
        });

        th.setDaemon(true); // 현재 작업 중인 쓰레드가 종료 -> 함께 종료
        th.start();


        for (int i = 1; i <= 10; i++) {

            Thread.sleep(1000);
            System.out.println(i);
            if (i == 3) {
                autoSave = true;
            }
        }
    }
}
