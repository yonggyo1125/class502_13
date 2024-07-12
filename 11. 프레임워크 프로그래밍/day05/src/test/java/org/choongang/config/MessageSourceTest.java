package org.choongang.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;

import java.util.Locale;

@SpringJUnitWebConfig
@ContextConfiguration(classes = MvcConfig.class)
public class MessageSourceTest {

    @Autowired
    private MessageSource messageSource;

    @Test
    void test1() {
        //String message = messageSource.getMessage("LOGIN_MSG", new Object[] {"사용자01", "USER01"}, Locale.KOREAN);
        String message = messageSource.getMessage("LOGIN_MSG", new Object[] {"사용자01", "USER01"}, Locale.ENGLISH);
        System.out.println(message);
    }

    @Test
    void test2() {
        String message = messageSource.getMessage("EMAIL", null, Locale.KOREAN);
        System.out.println(message);
    }
}
