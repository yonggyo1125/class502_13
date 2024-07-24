package org.choongang.member.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.choongang.global.entities.BaseEntity;
import org.choongang.member.constants.Authority;

@Builder
@Data
@Entity
@NoArgsConstructor @AllArgsConstructor
//@Table(name="CH_MEMBER") // 테이블 이름이 클래스명과 다른 경우
/*
@Table(indexes = {
        @Index(name="idx_created_at_desc", columnList = "createdAt DESC"),
        @Index(name="uq_email_passsword", columnList = "email, password", unique = true)
})*/
public class Member extends BaseEntity {
    @Id /* @GeneratedValue(strategy = GenerationType.AUTO) */ @GeneratedValue
    private Long seq;

    @Column(length=60, nullable = false, unique = true)
    private String email;

    @Column(length=65, nullable = false)
    private String password;

    @Column(length=40, nullable = false, name="name")
    private String userName;

   // @Lob
    @Transient
    private String introduction;

    @Column(length=10)
    @Enumerated(EnumType.STRING)
    private Authority authority;
}
