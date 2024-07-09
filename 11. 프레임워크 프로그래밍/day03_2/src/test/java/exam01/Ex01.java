package exam01;

import config.AppCtx;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppCtx.class)
public class Ex01 {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    void test1() {
        String sql = "INSERT INTO MEMBER (SEQ, EMAIL, PASSWORD, USER_NAME) " +
                    " VALUES (SEQ_MEMBER.NEXTVAL, ?, ?, ?)";
        int result = jdbcTemplate.update(sql, "user03@test.org", "123456", "사용자03");

        System.out.println(result);
    }
}
