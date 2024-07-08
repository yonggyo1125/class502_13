package exam01;

public class ImplCalculator implements Calculator {

    @Override
    public long factorial(long num) {
        long result = 1L;

        for (long i = 1L; i<= num; i++) {
            result *= i;
        }

        return result;
    }
}
