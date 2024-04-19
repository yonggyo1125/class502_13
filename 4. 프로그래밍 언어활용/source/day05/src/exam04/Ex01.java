package exam04;

public class Ex01 {
    public static void main(String[] args) {
        C c = new C(); // 다형성
        A a = c;
        B b = c;

        System.out.println("c : " + System.identityHashCode(c));
        System.out.println("a : " + System.identityHashCode(a));
    }
}
