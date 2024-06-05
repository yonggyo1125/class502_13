package exam01;

import org.junit.jupiter.api.*;

@Tag("exercise")
public class Ex02Test {
    @BeforeAll
    static void beforeAll() {
        System.out.println("BEFORE ALL");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("AFTER ALL");
    }

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
