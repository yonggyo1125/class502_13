package exam01;

import org.junit.jupiter.api.Test;

import java.sql.*;
import java.time.LocalDateTime;

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
            String keyword = "사용자"; // SQL 주입의 가능성 높다
            String sql = "SELECT * FROM MEMBER WHERE USER_NM LIKE '%" + keyword + "%'";


            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()) {
                long userNo = rs.getLong("USER_NO");
                String userId = rs.getString("USER_ID");
                String userPw = rs.getString("USER_PW");
                String userNm = rs.getString("USER_NM");
                String mobile = rs.getString("MOBILE");
                LocalDateTime regDt = rs.getTimestamp("REG_DT").toLocalDateTime();

                System.out.printf("USER_NO:%d, USER_ID:%s, USER_PW:%s, USER_NM:%s, MOBILE:%s, REG_DT:%s%n", userNo, userId, userPw, userNm, mobile, regDt);
            }

            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
