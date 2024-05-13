package exam03;

public class Ex06 {
    public static void main(String[] args) {
        Ex06_1 th1 = new Ex06_1();
        Ex06_2 th2 = new Ex06_2();
        th2.setPriority(7);
        System.out.println("Priority of th1(-) : " + th1.getPriority());
        System.out.println("Priority of th2(|) : " + th2.getPriority());
        th1.start();
        th2.start();
    }
}

class Ex06_1 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("-");
            for (int x = 0; x < 1000000000; x++);
        }
    }
}

class Ex06_2 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("|");
            for (int x = 0; x < 1000000000; x++);
        }
    }
}