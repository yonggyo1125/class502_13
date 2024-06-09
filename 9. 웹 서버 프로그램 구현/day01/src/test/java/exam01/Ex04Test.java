package exam01;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

import java.util.Locale;

public class Ex04Test {
    @Test
    void test1() {
        Faker faker = new Faker(Locale.KOREAN);
        System.out.println(faker.weather().description());
        System.out.println(faker.name().fullName());
        System.out.println(faker.address().cityName());
    }
}
