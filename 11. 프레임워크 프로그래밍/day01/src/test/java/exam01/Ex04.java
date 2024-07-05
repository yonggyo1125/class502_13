package exam01;

import exam01.config.AppCtx3;
import exam01.member.controllers.RequestJoin;
import exam01.member.services.InfoService;
import exam01.member.services.JoinService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex04 {

    @Test
    void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx3.class);

        JoinService joinService = ctx.getBean(JoinService.class);
        InfoService infoService = ctx.getBean(InfoService.class);

        RequestJoin form = RequestJoin.builder()
                        .email("user01@test.org")
                        .password("12345678")
                        .confirmPassword("12345678")
                        .userName("사용자01")
                        .build();

        joinService.process(form);

        infoService.printList();

        ctx.close();
    }
}
