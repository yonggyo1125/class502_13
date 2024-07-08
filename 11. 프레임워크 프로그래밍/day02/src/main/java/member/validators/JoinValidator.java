package member.validators;


import global.validators.Validator;
import member.controllers.RequestJoin;
import member.dao.MemberDao;

public class JoinValidator implements Validator<RequestJoin> {

    private MemberDao memberDao;

    public void setMemberDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    @Override
    public void check(RequestJoin form) {

    }
}
