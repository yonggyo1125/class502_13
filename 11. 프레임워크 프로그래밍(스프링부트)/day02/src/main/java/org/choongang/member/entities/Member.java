package org.choongang.member.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
    @Id /* @GeneratedValue(strategy = GenerationType.AUTO) */ @GeneratedValue
    private Long seq;
    private String email;
    private String password;
    private String userName;

    @Lob
    private String introduction;

    @CreationTimestamp
    private LocalDateTime createdAt;

    @UpdateTimestamp
    private LocalDateTime modifiedAt;
}
