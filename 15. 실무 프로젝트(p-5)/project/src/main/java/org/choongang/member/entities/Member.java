package org.choongang.member.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class Member {
    private Long seq;
    private String email;

    @JsonIgnore
    private String password;
    private String userName;
    private String mobile;
}
