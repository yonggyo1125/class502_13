package exam01;

public class Ex01 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Calculator cal = outer.method(30);
        int result = cal.add(10, 20);

        System.out.println(result);
    }
}
