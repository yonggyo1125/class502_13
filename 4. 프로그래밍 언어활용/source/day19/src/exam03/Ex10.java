package exam03;

public class Ex10 implements Runnable {
    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread t = new Thread(new Ex10());
        t.setDaemon(true);
        t.start();

        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            System.out.println(i);
            if (i == 5) {
                autoSave = true;
            }
        }
    }

    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(3 * 1000); // 3초마다
                if (autoSave) {
                    autoSave();
                }
            } catch (InterruptedException e) {}
        }
    }

    public void autoSave() {
        System.out.println("작업파일이 자동 저장되었습니다.");
    }
}
