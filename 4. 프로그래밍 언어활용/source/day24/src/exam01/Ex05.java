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
    }
}
