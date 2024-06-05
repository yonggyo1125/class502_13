package exam01;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@Tag("exercise")
@DisplayName("테스트....")
public class Ex01Test {

    @Test
    @DisplayName("테스트1...")
    void test1() {
        Calculator cal = new Calculator();
        int num1 = 10, num2 = 20;
        int result = cal.add(num1, num2);

        assertEquals(30, result);
    }

    @Test
    @Disabled
    @DisplayName("테스트2...")
    void test2() {
        LocalDate expected = LocalDate.now();
        LocalDate date = LocalDate.of(2024, 6, 5);

        assertEquals(expected, date); // equals and hashCode

        assertSame(expected, date); // 테스트 실패
    }

    @Test
    @Disabled
    @DisplayName("테스트3.....")
    void test3() {
        fail();
    }
}
