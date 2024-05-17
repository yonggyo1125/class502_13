package exam01;

public class Ex02 {
    public static void main(String[] args) {

    }
}

class Ex02_1 extends Thread {

    public void run() {
        throwException();
    }

    private void throwException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
