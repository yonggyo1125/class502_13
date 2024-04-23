package exam14;

import exam13.Calculator;

public class Ex02 {

    private static Calculator cal2 = new Calculator() {
        @Override
        public int add(int num1, int num2) {
            return num1 + num2;
        }
    };

    public static void main(String[] args) {
        int num3 = 30;
        Calculator cal = new Calculator() {
            public int add(int num1, int num2) {
                //num3 = 40; // 지역변수의 상수화
                return num1 + num2 + num3;
            }
        };
    }
}
