package exam01.member;

import exam01.member.dao.MemberDao;
import exam01.member.services.JoinService;
import exam01.member.validators.JoinValidator;

public class Assembler {

    public MemberDao memberDao() {
        return new MemberDao();
    }

    public JoinValidator joinValidator() {
        return new JoinValidator();
    }

    public JoinService joinService() {
        return new JoinService(joinValidator(), memberDao());
    }
}
