package exam01;

public class Ex04 {
    public static void main(String[] args) {
        start(new Ex04_1());
        start(() -> System.out.println("테스트"));
    }

    public static void start(Runnable th) {

    }
}

class Ex04_1 extends Thread {
    public void run() {

    }
}
