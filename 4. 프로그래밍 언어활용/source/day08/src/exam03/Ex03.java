package exam03;

public class Ex03 {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(1000000);
        Integer num2 = Integer.valueOf(1000000);

        System.out.printf("num1 주소: %d%n", System.identityHashCode(num1));
        System.out.printf("num2 주소: %d%n", System.identityHashCode(num2));
    }
}
