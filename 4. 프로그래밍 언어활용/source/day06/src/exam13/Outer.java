package exam13;

public class Outer {
    public Calculator method(int num3) {

        Calculator cal = new Calculator() {
            public int add(int num1, int num2) {
                //num3 = 100; // final int num3 - 지역변수의 상수화
                return num1 + num2 + num3;
            }
        };

        return cal;
    }
}
