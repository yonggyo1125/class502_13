package exam02;

public class Ex05 {
    public static void main(String[] args) {
        A a1 = new C();
        A a2 = new D();
        printA(a1);
        printA(a2);
    }

    public static void printA(A param) {
       if (param instanceof C) {
           C c = (C) param;
       }

    }
}
