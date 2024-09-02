package org.choongang.member.controllers;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class RequestJoin {
    @NotBlank @Email
    private String email;

    @NotBlank
    private String password;

    @NotBlank
    private String confirmPassword;
    private String userName;
    private String mobile;
}
