package org.choongang.member.mappers;

import org.choongang.config.MvcConfig;
import org.choongang.member.entities.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;

@SpringJUnitWebConfig
@ContextConfiguration(classes = MvcConfig.class)
public class MapperTest {

    @Autowired
    private MemberMapper mapper;

    @Test
    void test1() {
        long total = mapper.getTotal();
        System.out.println(total);
    }

    @Test
    void test2() {
        Member member = mapper.get("user02@test.org");
        System.out.println(member);
    }

    @Test
    void test3() {
        int cnt = mapper.exists("user02@test.org");
        System.out.println(cnt);
    }
}
