package org.choongang.jpa_study;

import org.choongang.member.constants.Authority;
import org.choongang.member.entities.Member;
import org.choongang.member.repositories.MemberRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.List;
import java.util.stream.IntStream;

@SpringBootTest
@TestPropertySource(properties = "spring.profiles.active=test")
public class Ex05 {

    @Autowired
    private MemberRepository memberRepository;

    @BeforeEach
    void init() {

        List<Member> members = IntStream.rangeClosed(1, 10)
                .mapToObj(i -> Member.builder()
                        .email("user" + i + "@test.org")
                        .password("12345678")
                        .userName("사용자" + i)
                        .authority(Authority.USER)
                        .build()).toList();

        memberRepository.saveAllAndFlush(members);
        /*
        for (int i = 1; i <= 10; i++) {

            Member member = Member.builder()
                    .email("user" + i + "@test.org")
                    .password("12345678")
                    .userName("사용자" + i)
                    .authority(Authority.USER)
                    .build();

            memberRepository.save(member);
        }
        */

        //memberRepository.flush();

        //member.setUserName("(수정)사용자01");

        //memberRepository.save(member);
        //memberRepository.flush();
    }

    @Test
    void test1() {
        Member member = memberRepository.findById(1L).orElse(null);
        System.out.println(member);

        member.setUserName("(수정)사용자01");
        memberRepository.save(member);

        //memberRepository.flush();

        Member member2 = memberRepository.findById(1L).orElse(null);
        System.out.println(member2);

        memberRepository.delete(member2);
        memberRepository.flush();
    }

    @Test
    void test2() {
        List<Member> members = memberRepository.findAll();
        members.forEach(System.out::println);
    }
}
