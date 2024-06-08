package exam01;

public class Ex04 {
    public static void main(String[] args) {
        int result1 = add(10, 20);
        System.out.println(result1);

        int result2 = add(10, 20, 30);
        System.out.println(result2);
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
