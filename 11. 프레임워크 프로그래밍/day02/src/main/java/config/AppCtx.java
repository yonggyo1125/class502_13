package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
/*
@ComponentScan(basePackages="member",
    excludeFilters = @ComponentScan.Filter(type= FilterType.ANNOTATION, classes= ManualBean.class)
)
 */
/*
@ComponentScan(basePackages = "member",
    excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes={MemberDao.class, JoinValidator.class})
)
 */
/*
@ComponentScan(basePackages = "member",
    excludeFilters = @ComponentScan.Filter(type= FilterType.REGEX,
    pattern="member\\.*\\w*Dao")
)
 */
@ComponentScan(basePackages = "member",
    excludeFilters = @ComponentScan.Filter(type= FilterType.ASPECTJ,
            pattern="member..*Dao")
)
public class AppCtx {


}
