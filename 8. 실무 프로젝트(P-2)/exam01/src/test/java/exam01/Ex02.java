package exam01;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

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

    }
}
