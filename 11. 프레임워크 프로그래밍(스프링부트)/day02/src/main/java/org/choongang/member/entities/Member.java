package org.choongang.member.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.choongang.global.entities.BaseEntity;
import org.choongang.member.constants.Authority;

@Data
@Entity
//@Table(name="CH_MEMBER") // 테이블 이름이 클래스명과 다른 경우
/*
@Table(indexes = {
        @Index(name="idx_created_at_desc", columnList = "createdAt DESC"),
        @Index(name="uq_email_passsword", columnList = "email, password", unique = true)
})*/
public class Member extends BaseEntity {
    @Id /* @GeneratedValue(strategy = GenerationType.AUTO) */ @GeneratedValue
    private Long seq;
    private String email;
    private String password;
    @Column(name="name")
    private String userName;

   // @Lob
    @Transient
    private String introduction;

    @Enumerated(EnumType.STRING)
    private Authority authority;
}
