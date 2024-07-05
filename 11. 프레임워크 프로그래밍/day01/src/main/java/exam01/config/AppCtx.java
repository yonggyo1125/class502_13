package exam01.config;

import exam01.Greeter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// 설정 클래스 - 스프링 컨테이가 관리할 객체를 정의, 설정
//@Import(value={AppCtx2.class})
//@Import({AppCtx2.class})
@Import(AppCtx2.class)
@Configuration
public class AppCtx {

    @Bean
    public Greeter greeter() {
        return new Greeter();
    }
}
