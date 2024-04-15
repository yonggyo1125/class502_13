package exam01;

public class Ex02 {
    public static void main(String[] args) {
        int num = 10;
        boolean result = ++num > 10 && (num = num + 10) > 15;
        System.out.println(result);
        System.out.println(num);
        boolean result2 = !result; // true -> false
        System.out.println(result2);
    }
}
