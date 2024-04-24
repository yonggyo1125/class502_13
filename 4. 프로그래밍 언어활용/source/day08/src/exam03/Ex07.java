package exam03;

public class Ex07 {
    public static void main(String[] args) {
        double result = add(10.0, 10L);
        System.out.println(result);
    }

    public static double add(Number num1, Number num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
}
