package exam01.config;

import exam01.member.dao.MemberDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "exam01.member")
@ComponentScan("exam01.member")
public class AppCtx3 {
    /*
    @Bean
    public MemberDao memberDao() {
        System.out.println("수동 등록 빈!");
        return new MemberDao();
    }
    */

}
