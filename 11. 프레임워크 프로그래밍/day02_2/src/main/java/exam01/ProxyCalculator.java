package exam01;

public class ProxyCalculator implements Calculator {

    // ImplCalculator, RecCalculator 대신 수행 주려면? 자료형?

    private Calculator calculator;

    public ProxyCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public long factorial(long num) {

        // 다른 계산기의 핵심 기능을 대신 수행
        long result = calculator.factorial(num); // 다른 계산기의 factorial 연산을 대신 수행

        return result;
    }
}
