package exam01;

import configs.DBConn;
import mappers.MemberMapper;
import member.Member;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

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
}
