package org.choongang.member.controllers;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class MemberSearch {
    @DateTimeFormat(pattern="yyyyMMdd")
    private LocalDate sDate; // 검색 시작일

    @DateTimeFormat(pattern="yyyyMMdd")
    private LocalDate eDate; // 검색 종료일
}
