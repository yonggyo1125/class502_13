package config;

import board.services.BoardService2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

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
/*
@ComponentScan(basePackages = {"member", "board"},
    excludeFilters = @ComponentScan.Filter(type= FilterType.ASPECTJ,
            pattern="member..*Dao")
)
 */
@ComponentScan({"member", "board"})
public class AppCtx {

    @Scope("prototype")
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public BoardService2 boardService2() {
        return new BoardService2();
    }
}
