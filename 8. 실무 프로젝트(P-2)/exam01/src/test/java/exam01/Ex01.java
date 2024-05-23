package exam01;

import org.junit.jupiter.api.Test;

import java.sql.*;

public class Ex01 {
    @Test
    void test1() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

       // String url = "jdbc:oracle:thin:@localhost:1521:EE"
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "STUDY"; // SCOTT
        String password = "oracle";  // tiger

        try (Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement()) {

            String sql = "INSERT INTO MEMBER (USER_NO, USER_ID, USER_PW, USER_NM, MOBILE) VALUES (SEQ_MEMBER.NEXTVAL, 'USER02', '123456', '사용자02', '01000000000')";

            int cnt = stmt.executeUpdate(sql);
            System.out.println(cnt);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Test
    void test2() {
        try {
            // 오라클 드라이버 동적 로딩
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String user = "STUDY"; // SCOTT
        String password = "oracle"; // tiger
        try(Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement()) {

            String sql = "SELECT * FROM MEMBER";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                long userNo = rs.getLong(1);
                String userId = rs.getString(2);

                System.out.printf("USER_NO:%d, USER_ID:%s%n", userNo, userId);
            }

            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
