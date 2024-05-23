package exam01;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Ex03 {

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

    }
}
