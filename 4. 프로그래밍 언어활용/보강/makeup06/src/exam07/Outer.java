package exam07;

public class Outer {
    void method() {
        class Inner {
            void method() {
                System.out.println("지역 내부 클래스");
            }
        }

        Inner in = new Inner();
        in.method();
    }
}
