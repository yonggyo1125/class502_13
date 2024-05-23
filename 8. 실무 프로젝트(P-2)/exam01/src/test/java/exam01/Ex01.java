package exam01;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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

            String sql = "INSERT INTO MEMBER (USER_NO, USER_ID, USER_PW, USER_NM, MOBILE) VALUES (SEQ_MEMBER.NEXTVAL, 'USER01', '123456', '사용자01', '01000000000')";

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
