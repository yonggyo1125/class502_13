package exam04;

public class Ex08 {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(100);
        Integer num2 = Integer.valueOf(100);
        System.out.println("num1 주소 : " + System.identityHashCode(num1));
        System.out.println("num2 주소 : " + System.identityHashCode(num2));
        double num3 = num1.doubleValue();
    }
}
