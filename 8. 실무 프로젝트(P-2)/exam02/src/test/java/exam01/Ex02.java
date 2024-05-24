package exam01;

import configs.DBConn;
import mappers.MemberMapper;
import member.Member;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Ex02 {

   private SqlSession session = DBConn.getSession();


    @Test
    void test1() {
        MemberMapper mapper = session.getMapper(MemberMapper.class);

        Member member = Member.builder()
                .userId("USER" + System.currentTimeMillis())
                .userPw("123456")
                .userNm("사용자..")
                .mobile("01000000000")
                .build();
        int cnt = mapper.register(member);
        //int cnt = session.insert("mappers.MemberMapper.register", member);
        System.out.println(cnt);

    }

    @Test
    void test2() {
        MemberMapper mapper = session.getMapper(MemberMapper.class);

        Member member = Member.builder()
                .userId("USER01")
                .userPw("123456")
                .userNm("(수정)사용자01")
                .mobile("01000000000")
                .build();

        int cnt = session.update("mappers.MemberMapper.modify", member);
        System.out.println(cnt);
    }
}
