package org.choongang.member.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor @AllArgsConstructor
//@Table("CH_MEMBER")
public class Member {
    @Id
    //@Column("ID")
    private Long seq;

    private String email;

    private String password;

    private String userName;

    private LocalDateTime regDt;
}
