package exam02;

public class Ex04 {
    public static void main(String[] args) {
        A ad = new D();

        A ac = new C();

        if (ad instanceof C) {
            C c = (C) ad;
        }

        if (ac instanceof C) {
            C cc = (C) ac;
            System.out.println(cc.numC);
        }
    }
}
