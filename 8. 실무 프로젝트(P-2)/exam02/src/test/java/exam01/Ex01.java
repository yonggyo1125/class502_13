package exam01;

import configs.DBConn;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import member.Member;

import java.util.List;

public class Ex01 {
    @Test
    void test1() {
        SqlSession session = DBConn.getSession();
        List<Member> members = session.selectList("mappers.MemberMapper.getList");
        members.forEach(System.out::println);
    }
}
