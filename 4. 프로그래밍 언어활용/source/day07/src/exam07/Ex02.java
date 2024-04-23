package exam07;

public class Ex02 {
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 2;
            int result = num1 / num2; // throw new Arithi...

            String str = null;
            str.toUpperCase(); //


            System.out.println("코드 실행!");
        } catch (ArithmeticException e) {
            e.printStackTrace();

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("중요한 코드 실행!");
    }
}
