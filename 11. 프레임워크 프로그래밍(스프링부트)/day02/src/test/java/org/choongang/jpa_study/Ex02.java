package org.choongang.jpa_study;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.choongang.member.entities.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@SpringBootTest
@Transactional
@TestPropertySource(properties = "spring.profiles.active=test")
public class Ex02 {

    @PersistenceContext
    private EntityManager em;

    @BeforeEach
    void init() {
        for (long i = 1L; i <= 10L; i++) {
            Member member = new Member();
            member.setSeq(i);
            member.setEmail("user" + i + "@test.org");
            member.setPassword("12345678");
            member.setUserName("사용자" + i);
            member.setCreatedAt(LocalDateTime.now());
            em.persist(member); // 영속 상태
        }

        em.flush(); // DB 영구 반영
    }

    @Test
    void test1() {
        Member member = em.find(Member.class, 1L);
        System.out.println(member);

        Member member2 = em.find(Member.class, 1L);
        System.out.println(member2);

        System.out.println(member == member2);
        System.out.println("member:" + System.identityHashCode(member));
        System.out.println("member2:" + System.identityHashCode(member2));
    }
}
