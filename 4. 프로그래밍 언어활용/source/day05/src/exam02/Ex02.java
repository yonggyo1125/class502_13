package exam02;

public class Ex02 {
    public static void main(String[] args) {
        C c = new C();
        A a = c;

        System.out.println("c : " + System.identityHashCode(c));
        System.out.println("a : " + System.identityHashCode(a));

        D d = new D();
        A ad = d;
        System.out.println("d : " + System.identityHashCode(d));
        System.out.println("ad : " + System.identityHashCode(ad));

        //B b = c;

        //A a = new C();


    }
}
