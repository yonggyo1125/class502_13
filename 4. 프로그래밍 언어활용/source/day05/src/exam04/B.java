package exam04;

public class B extends A {
    int numB = 20;

    public B() {
        super(); // A클래스의 A()
        System.out.println("B 생성자!");
    }
}
