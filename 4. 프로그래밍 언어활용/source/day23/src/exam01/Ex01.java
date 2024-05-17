package exam01;

public class Ex01 {
    public static void main(String[] args) { // + 호출 스택 -> 메인 쓰레드
        Runnable r = () -> {
          for (int i = 0; i < 5; i++) {
              System.out.println("쓰레드2-" + i);

              for(long j = 0; j < 10000000000L; j++);
          }
        };

        Ex01_1 th1 = new Ex01_1();
        Thread th2 = new Thread(r);

        //th1.run();
        //th2.run();
        th1.start(); // 호출스택 생성 + run() 메서드 실행
        th2.start(); // 호출스택 생성 + run() 메서드 실행

        System.out.println("작업 종료!");
    }
}

class Ex01_1 extends Thread {
    public Ex01_1() {
        super("변경된이름1");
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            //System.out.println("쓰레드1-" + i);
            System.out.println(getName() + "-" + i);
            for(long j = 0; j < 10000000000L; j++);
        }
    }
}
