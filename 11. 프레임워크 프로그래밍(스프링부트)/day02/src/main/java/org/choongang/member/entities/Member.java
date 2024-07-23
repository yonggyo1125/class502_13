package org.choongang.member.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
//@Table(name="CH_MEMBER")
/*
@Table(indexes = {
        @Index(name="idx_created_at_desc", columnList = "createdAt DESC"),
        @Index(name="uq_email_passsword", columnList = "email, password", unique = true)
})*/
public class Member {
    @Id @GeneratedValue
    private Long seq;
    private String email;
    private String password;
    private String userName;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
}
