package org.choongang.board.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.choongang.global.entities.BaseEntity;
import org.choongang.member.entities.Member;

import java.util.List;

@Data
@Builder
@Entity
@NoArgsConstructor @AllArgsConstructor
public class BoardData extends BaseEntity {
    @Id @GeneratedValue
    private Long seq;

    @ManyToOne(fetch=FetchType.LAZY) // member_seq - 엔티티명_기본키 속성명
    @JoinColumn(name="mSeq")
    private Member member;

    @Column(nullable = false)
    private String subject;

    @Lob
    private String content;

    @ManyToMany
    private List<HashTag> tags;
}
