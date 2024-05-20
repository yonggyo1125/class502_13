package exam01;

public class Ex05 {

    private static boolean autoSave = false;

    public static void main(String[] args) {
        Thread th = new Thread(() -> {
           while(true) {
               if (autoSave) {
                   System.out.println("저장!");
               }

               try {
                   Thread.sleep(3000); // 3초
               } catch (InterruptedException e) {}
           }
        });

        th.start();

        for (int i = 1; i <= 10; i++) {
            Thread th2 = Thread.currentThread();
            System.out.println(th2.getName() + " - " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}

            if (i == 3) autoSave = true;
        }
    }
}
