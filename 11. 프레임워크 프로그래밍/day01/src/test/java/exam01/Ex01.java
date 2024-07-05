package exam01;

import exam01.config.AppCtx;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    @Test
    void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class); // 스프링 컨테이너 객체

        Greeter g1 = ctx.getBean("greeter", Greeter.class);
        g1.hello("이이름");


        Greeter g2 = ctx.getBean("greeter", Greeter.class);
        g2.hello("김이름");

        System.out.println(g1 == g2); // 주소 비교 - 싱글톤 형태로 관리

        ctx.close();
    }
}
