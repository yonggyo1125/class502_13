package org.choongang.member.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Member {
    @Id
    private Long seq;
    private String email;
    private String password;
    private String userName;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;
}
