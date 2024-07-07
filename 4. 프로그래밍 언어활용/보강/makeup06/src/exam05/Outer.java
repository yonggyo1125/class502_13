package exam05;

public class Outer {
    int num1 = 100;

    class Inner { // 인스턴스 내부 클래스
        int num1 = 200;
        static int num2 = 200; // JDK 15까지는 안됨

        public void method() {
            System.out.println(num1);
        }

        public void method2() {
            System.out.println(Outer.this.num1); // 100
        }

    }
}
