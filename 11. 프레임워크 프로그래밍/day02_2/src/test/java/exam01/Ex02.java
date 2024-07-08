package exam01;

import exam02.CaculatorHandler;
import exam02.Calculator;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

public class Ex02 {

    @Test
    void test1() {
        Object obj = Proxy.newProxyInstance(
                Calculator.class.getClassLoader(),
                new Class[] { Calculator.class },
                new CaculatorHandler()
        );

        Calculator cal = (Calculator) obj;
        cal.factorial(10L);
    }
}
