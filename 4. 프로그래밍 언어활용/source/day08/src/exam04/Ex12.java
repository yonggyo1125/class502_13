package exam04;

public class Ex12 {
    public static void main(String[] args) {
        Calculator cal = new Calculator(10) {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };
    }
}
