package exam03;

public class Ex00 {
    public static void main(String[] args) {
        /*
        Calculator cal = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };

        calc(cal);
         */
        calc(new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        });

        calc((a,b) -> a + b);
    }

    public static void calc(Calculator cal) {
        int result = cal.add(10, 20);
        System.out.println(result);
    }
}
