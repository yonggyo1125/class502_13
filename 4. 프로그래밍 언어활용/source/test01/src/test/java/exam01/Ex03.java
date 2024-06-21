package exam01;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class Ex03 {

    @Test
    void test1() {
        HikariConfig config = new HikariConfig();
        config.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        config.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:EE");
        config.setUsername("scott");
        config.setPassword("tiger");
        config.setMaximumPoolSize(10);
        config.setMinimumIdle(2);
        
        HikariDataSource ds = new HikariDataSource(config);

        String sql = "SELECT * FROM MEMBER WHERE USER_ID = ?";
        try (Connection conn = ds.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql)){
            pstmt.setString(1, "USER01");
            ResultSet rs = pstmt.executeQuery();

            while(rs.next()) {
                String userId = rs.getString("USER_ID");
                String userNm = rs.getString("USER_NM");
                LocalDateTime regDt = rs.getTimestamp("REG_DT").toLocalDateTime();

                System.out.printf("userId=%s, userNm=%s, regDt=%s%n", userId, userNm, regDt);
            }

            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
