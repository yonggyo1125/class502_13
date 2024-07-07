package exam05;

public class Ex01 {
    public static void main(String[] args) {
        Outer out = new Outer();
        Outer.Inner in = out.new Inner();
        in.method();
        in.method2();
    }
}
