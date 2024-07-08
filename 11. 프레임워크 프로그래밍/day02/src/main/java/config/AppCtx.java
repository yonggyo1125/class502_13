package config;

import global.annotations.ManualBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages="member",
    excludeFilters = @ComponentScan.Filter(type= FilterType.ANNOTATION, classes= ManualBean.class)
)
public class AppCtx {


}
