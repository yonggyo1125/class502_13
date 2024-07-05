package exam01.member.services;

import exam01.member.dao.MemberDao;
import exam01.member.entities.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
import java.util.Optional;

public class InfoService {
    private MemberDao memberDao;

    @Autowired
    @Qualifier("mDao")
    public void setMemberDao(Optional<MemberDao> opt) {
        this.memberDao = opt.get();
    }

    public void printList() {
        List<Member> members = memberDao.getList();
        members.forEach(System.out::println);
    }
}
