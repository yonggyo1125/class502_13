package exam01;

public class Ex07 {
    private static boolean autoSave = false;

    public static void main(String[] args) {
        Thread th = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                }

                System.out.println("저장!");
            }
        });


    }
}
