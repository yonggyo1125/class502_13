package exam01.config;

import exam01.member.dao.MemberDao;
import exam01.member.services.InfoService;
import exam01.member.services.JoinService;
import exam01.member.validators.JoinValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx2 {

    @Bean
    public MemberDao memberDao() {
        return new MemberDao();
    }

    @Bean
    public JoinValidator joinValidator() {
        JoinValidator joinValidator = new JoinValidator();
        joinValidator.setMemberDao(memberDao());

        return joinValidator;
    }

    @Bean
    public JoinService joinService() {
        return new JoinService(joinValidator(), memberDao());
    }

    @Bean
    public InfoService infoService() {
        InfoService infoService = new InfoService();
        infoService.setMemberDao(memberDao());

        return infoService;
    }
}
