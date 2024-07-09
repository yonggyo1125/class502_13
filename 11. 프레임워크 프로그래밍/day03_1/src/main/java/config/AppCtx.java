package config;

import exam01.Calculator;
import exam01.RecCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy  // AOP 자동 설정 애노테이션
public class AppCtx {

    @Bean
    public ProxyCalculator proxyCalculator() {
        return new ProxyCalculator();
    }

    @Bean
    public Calculator calculator() {
        return new RecCalculator();
    }
}
