package exam03;

public class Ex04 {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {

            }
        };
        
        Thread th = new Thread(r);
    }
}
