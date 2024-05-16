package exam02;

public class Ex05 {
    public static void main(String[] args) {
        Calculator cal1 = new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };

        Calculator cal2 = (a, b) -> a + b; // 함수형 인터페이스, 추상메서드 1개

    }
}
