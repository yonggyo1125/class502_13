package exam03;

public class Ex04 {
    public static void main(String[] args) {
        A ac = new C();

        A ad = new D();

        if (ad instanceof C) {
            C c1 = (C) ad;
        }
    }
}
