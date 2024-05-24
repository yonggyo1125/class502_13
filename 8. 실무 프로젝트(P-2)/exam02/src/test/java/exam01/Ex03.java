package exam01;

import configs.DBConn;
import mappers.MemberMapper;
import member.Member;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Ex03 {

    private SqlSession session = DBConn.getSession();

    @Test
    void test1() {
        Member member = Member.builder()
                .userId("USER04")
                .userNm("(수정)사용자04")
                .build();

        MemberMapper mapper = session.getMapper(MemberMapper.class);
        int cnt = mapper.modify(member);
        System.out.println(cnt);
    }

    @Test
    void test2() {
        MemberMapper mapper = session.getMapper(MemberMapper.class);
        Member member = Member.builder()
                //.userId("USER99")
                .userNm("사용")
                .mobile("010")
                .build();
        List<Member> members = mapper.getList3(member);
        members.forEach(System.out::println);
    }
}
