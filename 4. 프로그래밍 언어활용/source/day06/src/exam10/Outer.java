package exam10;

public class Outer {

    int num1 = 10;

    static int num3 = 40;

    class Inner { // 인스턴스 내부 클래스
        int num1 = 15;
        int num2 = 20;
        static int num3 = 30;

        public void method() {

            System.out.println("인스턴스 내부 클래스에서 호출");
            System.out.printf("num1 + num2 = %d%n", Outer.this.num1 + num2);
        }
    }
}
