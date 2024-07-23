package org.choongang.jpa_study;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.choongang.member.entities.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.time.LocalDateTime;

@SpringBootTest
@TestPropertySource(properties = "spring.profiles.active=test")
public class Ex01 {

    @Autowired
    private EntityManagerFactory emf;

    @Test
    void test1() {
        EntityManager em = emf.createEntityManager();

        Member member = new Member();
        member.setSeq(1L);
        member.setEmail("user01@test.org");
        member.setPassword("12345678");
        member.setUserName("사용자01");
        member.setCreatedAt(LocalDateTime.now());

        em.persist(member);

        em.flush();
    }
}
