package org.choongang.jpa_study;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.choongang.board.entities.BoardData;
import org.choongang.board.entities.HashTag;
import org.choongang.board.repositories.BoardDataRepository;
import org.choongang.board.repositories.HashTagRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.IntStream;

@SpringBootTest
//@ActiveProfiles("test")
//@Transactional
public class Ex11 {

    @Autowired
    private BoardDataRepository boardDataRepository;

    @Autowired
    private HashTagRepository hashTagRepository;

   @PersistenceContext
   private EntityManager em;

    @BeforeEach
    void init() {
        List<HashTag> tags = IntStream.rangeClosed(1, 5)
                .mapToObj(i -> HashTag.builder()
                                .tag("태그" + i)
                                .build()).toList();

        hashTagRepository.saveAllAndFlush(tags);

        List<BoardData> items = IntStream.rangeClosed(1, 5)
                .mapToObj(i -> BoardData.builder()
                        .subject("제목" + i)
                        .content("내용" + i)
                        .tags(tags)
                        .build()).toList();
        boardDataRepository.saveAllAndFlush(items);

        //em.clear();
    }

    @Test
    void test0() {

    }

    @Test
    void test1() {
        BoardData item = boardDataRepository.findById(1L).orElse(null);

        List<HashTag> tags = item.getTags();
        tags.forEach(System.out::println);
    }

    @Test
    void test2() {
        HashTag tag = hashTagRepository.findById("태그2").orElse(null);
        List<BoardData> items = tag.getItems();
        items.forEach(System.out::println);
    }
}
