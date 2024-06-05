package exam01;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ex02Test {

    @BeforeEach
    void beforeEach() {
        System.out.println("BEFORE EACH");
    }

    @AfterEach
    void afterEach() {
        System.out.println("AFTER EACH");
    }

    @Test
    void test1() {
        System.out.println("테스트1번 진행");
    }

    @Test
    void test2() {
        System.out.println("테스트2번 진행");
    }
}
