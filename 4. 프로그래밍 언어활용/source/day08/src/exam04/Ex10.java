package exam04;

public class Ex10 {
    public static void main(String[] args) {
        int num1 = 100; // 기본 자료형 int
        Integer num2 = Integer.valueOf(200); // 참조 자료형 Integer
        int result = num1 + num2; // num2.intValue();

        Integer num3 = 300; // Integer.valueOf(300); // 오토 박싱
        num3.doubleValue();
    }
}
