package exam01;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.*;
import java.time.LocalDateTime;

public class Ex02 {
    private String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private String user = "STUDY";
    private String password = "oracle";

    @BeforeAll // 모든 테스트 메서드 호출 전에 단한번 실행 - 공통 초기화
    static void init() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    void test1() {
        String keyword = "사용자";
        String sql = "SELECT * FROM MEMBER WHERE USER_NM LIKE ?";
        try (Connection conn = DriverManager.getConnection(url, user,password);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, "%" + keyword + "%");

            ResultSet rs = pstmt.executeQuery();

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

    @Test
    void test2() {
        String userId = "USER04";
        String userPw = "123456";
        String userNm = "사용자04";
        String mobile = "01000000000";

        String sql = "INSERT INTO MEMBER (USER_NO, USER_ID, USER_PW, USER_NM, MOBILE) VALUES (SEQ_MEMBER.NEXTVAL, ?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(url, user, password);
            PreparedStatement pstmt = conn.prepareStatement(sql, new String[] {"USER_NO"})) {

            pstmt.setString(1, userId);
            pstmt.setString(2, userPw);
            pstmt.setString(3, userNm);
            pstmt.setString(4, mobile);

            int cnt = pstmt.executeUpdate();
            System.out.println(cnt);

            ResultSet rs = pstmt.getGeneratedKeys();
            if (rs.next()) {
                long userNo = rs.getLong(1);
                System.out.printf("USER_NO : %d%n", userNo);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
