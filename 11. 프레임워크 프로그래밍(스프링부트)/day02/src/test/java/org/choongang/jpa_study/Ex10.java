package org.choongang.jpa_study;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.choongang.member.repositories.MemberProfileRepository;
import org.choongang.member.repositories.MemberRepository;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@ActiveProfiles("test")
@Transactional
public class Ex10 {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private MemberProfileRepository profileRepository;

    @PersistenceContext
    private EntityManager em;

    @BeforeEach
    void init() {

    }
}
