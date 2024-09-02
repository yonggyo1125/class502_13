package org.choongang.member.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.choongang.member.entities.Member;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Member", description = "회원 API")
@RestController
@RequestMapping("/api/v1/member")
public class MemberController {

    @Operation(summary = "회원가입", description = "회원가입에 대한 자세한 설명")

    @ApiResponse(responseCode = "201", description = "회원가입 성공시 201")

    // 요청 데이터 설명
    @Parameters(
            {
                    @Parameter(name = "email", required = true, description = "이메일, 로그인시 사용"),
                    @Parameter(name = "password", required = true, description = "비밀번호, 로그인시 사용"),
                    @Parameter(name="mobile", required = false, description = "휴대전화번호")
            }
    )

    @PostMapping
    public ResponseEntity<Member> join(@RequestBody RequestJoin form) {

        return ResponseEntity.status(HttpStatus.CREATED).body(new Member());
    }
}
