package exam04;

public class C extends B {
    int numC = 30;

    public C() {
        super(); // B클래스의 B()
        System.out.println("C 생성자!");
    }
}
