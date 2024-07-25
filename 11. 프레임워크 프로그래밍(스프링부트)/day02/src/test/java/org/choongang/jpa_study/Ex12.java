package org.choongang.jpa_study;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.choongang.board.entities.BoardData;
import org.choongang.board.repositories.BoardDataRepository;
import org.choongang.member.constants.Authority;
import org.choongang.member.entities.Member;
import org.choongang.member.repositories.MemberRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.IntStream;

@SpringBootTest
@ActiveProfiles("test")
@Transactional
public class Ex12 {
    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private BoardDataRepository boardDataRepository;

    @PersistenceContext
    private EntityManager em;

    @BeforeEach
    void init() {
        Member member = Member.builder()
                .email("user01@test.org")
                .password("12345678")
                .userName("사용자01")
                .authority(Authority.USER)
                .build();

        memberRepository.saveAndFlush(member);


        List<BoardData> items = IntStream.rangeClosed(1, 10)
                .mapToObj(i -> BoardData.builder()
                        .subject("제목" + i)
                        .content("내용" + i)
                        .member(member)
                        .build()).toList();

        boardDataRepository.saveAllAndFlush(items);
        em.clear();
    }

    @Test
    void test1() {
        List<BoardData> items = boardDataRepository.findAll();

        for (BoardData item : items) {
            Member member = item.getMember();
            String email = member.getEmail();
            String userName = member.getUserName();
            System.out.printf("email=%s, userName=%s%n", email, userName);
        }
    }

    @Test
    void test2() {
        List<BoardData> items = boardDataRepository.getAllList();
    }
}
