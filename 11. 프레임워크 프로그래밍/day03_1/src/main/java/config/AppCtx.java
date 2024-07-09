package config;

import exam01.Calculator;
import exam01.RecCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
//@EnableAspectJAutoProxy(proxyTargetClass = true)  // 서브 클래스 기반 프록시
@EnableAspectJAutoProxy
public class AppCtx {

    @Bean
    public ProxyCache proxyCache() {
        return new ProxyCache();
    }

    @Bean
    public ProxyCalculator2 proxyCalculator() {
        return new ProxyCalculator2();
    }
    /*
    @Bean
    public RecCalculator calculator() {
        return new RecCalculator();
    }
     */

    @Bean
    public Calculator calculator() {
        return new RecCalculator();
    }
}
