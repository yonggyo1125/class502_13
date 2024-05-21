package configs;

import mybatis.mappers.MemberMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class DBConnection {
    private static SqlSessionFactory sessionFactory;
    static {
        try {
            Reader reader = Resources.getResourceAsReader("mybatis/configs/mybatis-config.xml");
            sessionFactory = new SqlSessionFactoryBuilder().build(reader, "dev");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSession() {
        SqlSession session = sessionFactory.openSession();


        return session;
    }
}
