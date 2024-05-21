package exam02;

public class Ex01 {
    public static void main(String[] args) {
        Ex01_1 ex01_1 = new Ex01_1();
        Thread th1 = new Thread(ex01_1);
        Thread th2 = new Thread(ex01_1);
        th1.start();
        th2.start();
    }
}

class Ex01_1 implements Runnable {

    private Account acc = new Account();

    @Override
    public void run() {
        while(acc.getBalance() > 0) {
            int money = (int)(Math.random() * 3 + 1) * 100; // 100~300
            acc.withdraw(money);
            System.out.println("balance : " + acc.getBalance());
        }
    }
}
