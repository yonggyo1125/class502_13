package org.choongang.member.api.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.choongang.global.Utils;
import org.choongang.global.exceptions.BadRequestException;
import org.choongang.global.rests.JSONData;
import org.choongang.member.controllers.RequestJoin;
import org.choongang.member.entities.Member;
import org.choongang.member.mappers.MemberMapper;
import org.choongang.member.services.JoinService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.IntStream;

@Slf4j
@RestController
@RequestMapping("/api/member")
@RequiredArgsConstructor
public class ApiMemberController {

    private final MemberMapper mapper;
    private final JoinService joinService;
    private final Utils utils;

    @PostMapping // POST /api/member
    public ResponseEntity join(@RequestBody @Valid RequestJoin form, Errors errors) {
        if (errors.hasErrors()) {
            throw new BadRequestException(utils.getErrorMessages(errors));
        }
        /*
        boolean result = false;
        if (!result) {
            throw new BadRequestException("예외 테스트!");
        }
        */
        joinService.process(form);

        // 응답 코드 201, 출력 바디 X
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


    @GetMapping("/info/{email}")
    public JSONData info(@PathVariable("email") String email) {
        // Content-Type: application/json

        Member member = mapper.get(email);

        return new JSONData(member);
    }

    @GetMapping("/list")
    public ResponseEntity<JSONData> list() {
        List<Member> members = IntStream.rangeClosed(1, 10)
                .mapToObj(i -> Member.builder()
                        .email("user" + i + "@test.org")
                        .password("12345678")
                        .userName("사용자" + i)
                        .regDt(LocalDateTime.now())
                        .build())
                .toList();

        HttpHeaders headers = new HttpHeaders(); // 헤더
        headers.add("t1", "v1");
        headers.add("t2", "v2");

        return new ResponseEntity<>(new JSONData(members), headers, HttpStatus.OK);
    }

    @GetMapping(path="/test", produces = "text/html;charset=UTF-8")
    public String test() {
        // Content-Type: text/plain
        return "안녕하세요!";
    }

    @GetMapping("/test2")
    public void test2() {
        log.info("test2....");

    }
    /*
    @ExceptionHandler(Exception.class)
    public ResponseEntity<JSONData> errorHandler(Exception e) {

        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR; // 500
        if (e instanceof CommonException commonException) {
            status = commonException.getStatus();
        }

        JSONData data = new JSONData();
        data.setSuccess(false);
        data.setMessage(e.getMessage());
        data.setStatus(status);

        e.printStackTrace();

        return ResponseEntity.status(status).body(data);
    } */
}
