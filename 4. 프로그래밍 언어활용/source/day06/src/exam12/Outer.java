package exam12;

public class Outer {
    public void method() {

        class Inner {
            public void method() {
                System.out.println("지역 내부 클래스에서 호출!");
            }
        }

        Inner inner = new Inner();
        inner.method();
    }
}
