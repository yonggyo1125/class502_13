package exam03;

public class Ex01 {
    public static void main(String[] args) {


        calc((a, b) -> a + b, 10, 20);
    }

    public static void calc(Calculator cal, int num1, int num2) {
        int result = cal.add(num1, num2);
        System.out.println(result);
    }
}
