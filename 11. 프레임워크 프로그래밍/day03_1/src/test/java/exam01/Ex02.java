package exam01;

import config.AppCtx;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex02 {
    @Test
    void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        //RecCalculator cal = ctx.getBean(RecCalculator.class);
        Calculator cal = ctx.getBean(Calculator.class);
        long result = cal.factorial(10L);
        System.out.println(result);

        long result2 = cal.factorial(10L);
        System.out.println(result2);

        long result3 = cal.factorial(10L);
        System.out.println(result3);

        long result4 = cal.factorial(10L);
        System.out.println(result4);

        ctx.close();
    }
}
