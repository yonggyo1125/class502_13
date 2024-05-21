package exam01;

import configs.DBConnection;
import members.Member;
import mybatis.mappers.MemberMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Ex02 {
    @Test
    void test1() {
        DataSource ds = new DataSource();
        ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        ds.setUrl("jdbc:oracle:thin:@localhost:1521:EE");
        ds.setUsername("scott");
        ds.setPassword("tiger");

        ds.setMaxActive(10);
        ds.setInitialSize(2);
        ds.setTestWhileIdle(true);
        ds.setMinEvictableIdleTimeMillis(60 * 1000);
        ds.setTimeBetweenEvictionRunsMillis(5 * 1000);

        try (Connection con = ds.getConnection()) {
            System.out.println(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    void test2() {
        SqlSession session = DBConnection.getSession();

        MemberMapper mapper = session.getMapper(MemberMapper.class);
        List<Member> members = mapper.list();
        members.forEach(System.out::println);

    }

    @Test
    void test3() {
        SqlSession session = DBConnection.getSession();
        MemberMapper mapper = session.getMapper(MemberMapper.class);
        Member member = mapper.getList("USER01");
        System.out.println(member);
    }

    @Test
    void test4() {
        SqlSession session = DBConnection.getSession();
        List<Member> members = session.selectList("mybatis.mappers.MemberMapper.list");
        members.forEach(System.out::println);

    }

    @Test
    void test5() {
        Member member = new Member();
        member.setUSER_ID("USER03");
        member.setUSER_NM("사용자03");
        member.setUSER_PW("123456");
        member.setAGE(30);

        SqlSession session = DBConnection.getSession();
        int result = session.insert("mybatis.mappers.MemberMapper.insert", member);
        System.out.println(result);
        System.out.println(member);
        session.commit();
    }

    @Test
    void test6() {
        SqlSession session = DBConnection.getSession();
        MemberMapper mapper = session.getMapper(MemberMapper.class);
        Member member = new Member();
        member.setUSER_ID("USER05");
        member.setUSER_NM("사용자05");
        member.setUSER_PW("123456");
        member.setAGE(30);
        int result = mapper.insert(member);
        System.out.println(result);
        System.out.println(member);
        session.commit();
    }
}
