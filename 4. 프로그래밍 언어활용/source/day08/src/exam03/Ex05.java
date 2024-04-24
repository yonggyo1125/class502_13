package exam03;

public class Ex05 {
    public static void main(String[] args) {
        int num1 = 100;
        Integer num2 = Integer.valueOf(200);

        int result1 = num1 + num2; // num2.intValue()
        System.out.println(result1);

        Integer num3 = Integer.valueOf(100);
        Integer num4 = Integer.valueOf(200);

        int result2 = num3.intValue() + num4.intValue();
        System.out.println(result2);
    }
}
