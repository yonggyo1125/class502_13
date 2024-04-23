package exam13;

public class Ex01 {
    public static void main(String[] args) {
        Outer out = new Outer();
        
        Calculator cal = out.method(30);
        int result = cal.add(10, 20); // 30 + 10 + 20
        System.out.println(result);

        int result2 = cal.add(20,30); // 30 + 20 + 30
        System.out.println(result2);
    }
}
