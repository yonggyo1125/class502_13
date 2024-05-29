package mappers;


import exam01.Member;

import java.util.List;

public interface MemberMapper {
    List<Member> getList();
    int register(Member member);
}
