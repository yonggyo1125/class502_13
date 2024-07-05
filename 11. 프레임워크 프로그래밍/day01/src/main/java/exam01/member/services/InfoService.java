package exam01.member.services;

import exam01.member.dao.MemberDao;
import exam01.member.entities.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

public class InfoService {
    private MemberDao memberDao;

    private DateTimeFormatter formatter;

    @Autowired
    @Qualifier("mDao")
    public void setMemberDao(Optional<MemberDao> opt) {
        this.memberDao = opt.get();
    }

    @Autowired
    public void setFormatter(DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    public void printList() {
        List<Member> members = memberDao.getList();
        members.forEach(m -> {
            System.out.println(m);
            LocalDateTime regDt = m.getRegDt();
            System.out.println(formatter.format(regDt));
        });
    }
}
