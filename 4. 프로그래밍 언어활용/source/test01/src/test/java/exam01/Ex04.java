package exam01;

import configs.DBConnection;
import members.Member;
import mybatis.mappers.MemberMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Ex04 {

    private SqlSession session;

    @BeforeEach
    void init() {
        session = DBConnection.getSession();
    }

    @Test
    void test1() {
        MemberMapper mapper = session.getMapper(MemberMapper.class);
        List<Member> members = mapper.getLists("사용자");

        members.forEach(System.out::println);
    }
}
