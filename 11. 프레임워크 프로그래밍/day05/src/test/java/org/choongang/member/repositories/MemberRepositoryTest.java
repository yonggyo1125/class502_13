package org.choongang.member.repositories;

import org.choongang.config.MvcConfig;
import org.choongang.member.entities.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;

import java.util.List;

import static org.springframework.data.domain.Sort.Order.asc;
import static org.springframework.data.domain.Sort.Order.desc;

@SpringJUnitWebConfig
@ContextConfiguration(classes = MvcConfig.class)
public class MemberRepositoryTest {

    @Autowired
    private MemberRepository repository;

    @Test
    void test1() {
        List<Member> members = (List<Member>) repository.findAll();
        members.forEach(System.out::println);
    }

    @Test
    void test2() {
        Member member = Member.builder()
                .seq(1L)
                .email("user01@test.org")
                .password("12345678")
                .userName("사용자06(수정)")
                .build();

        repository.save(member);

    }

    @Test
    void test3() {
        Member member = repository.findById(1L).orElse(null);
        System.out.println(member);

        repository.delete(member);
    }

    @Test
    void test4() {
        Member member = repository.findByEmail("user02@test.org");
        System.out.println(member);
    }

    @Test
    void test5() {
        Pageable pageable = PageRequest.of(0, 10);
        Page<Member> members = repository.findByUserNameContaining("용자", pageable);
        //members.forEach(System.out::println);
    }

    @Test
    void test6() {
        List<Member> members = repository.findByUserNameContainingAndEmailContainingOrderByRegDtDesc("용자", "user");
        members.forEach(System.out::println);
    }

    @Test
    void test7() {
        List<Member> members = repository.getMembers("%용자%", "%user%");
        members.forEach(System.out::println);
    }

    @Test
    void test8() {

        //Pageable pageable = PageRequest.of(0, 3);
        Pageable pageable = PageRequest.of(0, 3, Sort.by(desc("regDt"), asc("email")));
        Page<Member> data = repository.findByUserNameContaining("용자", pageable);

        List<Member> members = data.getContent();

        long total = data.getTotalElements(); // 조회된 전체 레코드 갯수
        int pages = data.getTotalPages();

        members.forEach(System.out::println);

        System.out.printf("총 갯수 : %d, 총 페이지 수 : %d%n", total, pages);

    }
}
