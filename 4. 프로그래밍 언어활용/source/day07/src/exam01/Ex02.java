package exam01;

public class Ex02 {

    public static void main(String[] args) {
        int result = add1(30);
        System.out.println(result);
    }

    public static int add1(int num) {
        return add2(10) + num;
    }

    public static int add2(int num) {
        return num * 2;
    }
}
