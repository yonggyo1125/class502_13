package board.services;

import board.entities.BoardData;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.IntStream;

public class BoardInfoService {

    public List<BoardData> getList() {
        // 게시글 목록 조회 로직 ....

        List<BoardData> items = IntStream.rangeClosed(1, 10)
                .mapToObj(i -> BoardData.builder()
                        .seq(i)
                        .subject("제목" + i)
                        .content("내용" + i)
                        .poster("작성자" + i)
                        .regDt(LocalDateTime.now())
                        .build())
                .toList();

        return items;

    }
}
