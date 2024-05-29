package exam01;

import configs.DBConn;
import mappers.MemberMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Ex01 {
    @Test
    void test1() {
        SqlSession session = DBConn.getSession();
        MemberMapper mapper = session.getMapper(MemberMapper.class);
        Member member = new Member();
        member.setUSER_ID("user03");
        member.setUSER_PW("123456");
        member.setUSER_NM("사용자03");

        //int cnt = session.insert("mappers.MemberMapper.register", member);
        int cnt = mapper.register(member);
        System.out.println(cnt);
    }

    @Test
    void test2() {
        SqlSession session = DBConn.getSession();
        MemberMapper mapper = session.getMapper(MemberMapper.class);
        List<Member> members = mapper.getList();

        //List<Member> members = session.selectList("mappers.MemberMapper.getList");
        members.forEach(System.out::println);
    }
}
