package exam03;

public class Ex06 {
    public static void main(String[] args) {
        Integer num1 = 100; // Integer.valueOf(100) - 오토 박싱
        Integer num2 = 200;

        Integer num3 = Integer.valueOf(num1.intValue() + num2.intValue());

        //double num3 = num1.doubleValue();
    }
}
