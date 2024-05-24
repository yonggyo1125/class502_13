package mappers;

import member.Member;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface MemberMapper {
    List<Member> getList();

    @Select("SELECT USER_NO userNo, USER_ID userId FROM MEMBER")
    List<Member> getList2();

    int register(Member member);

    int modify(Member member);
}
