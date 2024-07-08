package config;

import exam03.RecCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {

    @Bean
    public RecCalculator recCalculator() {
        return new RecCalculator();
    }
}