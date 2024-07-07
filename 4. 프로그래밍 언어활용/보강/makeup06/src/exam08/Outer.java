package exam08;

public class Outer {

    Calculator cal = new Calculator() {
        @Override
        public int add(int num1, int num2) {
            return num1 + num2;
        }
    };

    void method() {
        Calculator cal = new Calculator() {
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };

        int result = cal.add(10, 20);
        System.out.println(result);
    }

    public Calculator getCalculator() {
        return new Calculator() { // 익명 내부 클래스
            @Override
            public int add(int num1, int num2) {
                return num1 + num2;
            }
        };


    }
}
