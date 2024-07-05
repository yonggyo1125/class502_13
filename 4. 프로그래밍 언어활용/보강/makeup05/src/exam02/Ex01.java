package exam02;

public class Ex01 {
    public static void main(String[] args) {
        //Calculator cal1 = new Calculator();
        Calculator cal1 = new SimpleCalculator();
        int result = cal1.add(10, 20);
        System.out.println(result);

        System.out.println(cal1.num1);

        cal1.instantMethod();
    }
}
