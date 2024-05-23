package exam01;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex03 {

    /* DB 연결 URL, 계정 */
    private String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private String user = "STUDY"; // SCOTT
    private String password = "oracle"; // tiger

    @BeforeAll
    static void init() {
        try {
            // 오라클 드라이버 동적 로드
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    @Test
    void test1() {
        String sql = "CALL REGISTER_MEMBER(?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(url, user, password);
             CallableStatement cstmt = conn.prepareCall(sql)) {

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
