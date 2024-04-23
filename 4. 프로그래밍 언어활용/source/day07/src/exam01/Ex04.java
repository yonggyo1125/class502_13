package exam01;

public class Ex04 {
    public static void main(String[] args) {
        A a = new A() {
            public void method() {
                System.out.println("재정의된 메서드!");
            }
        };

        a.method();
    }
}
