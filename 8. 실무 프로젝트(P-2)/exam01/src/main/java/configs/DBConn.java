package configs;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

public class DBConn {
    private static SqlSessionFactory factory;

    static {
        try {
            // 설정파일(mybatis-config.xml) -> Reader 객체로 변환
            Reader reader = Resources.getResourceAsReader("configs/mybatis-config.xml");

            factory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSession(boolean autoCommit) {
        SqlSession session = factory.openSession(autoCommit);
        return session;
    }

    public static SqlSession getSession() {
        return getSession(true);
    }
}
