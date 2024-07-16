package org.choongang.survey.controllers;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Slf4j
@Controller
@RequestMapping("/survey")
@SessionAttributes("requestSurvey")
public class SurveyController {

    @ModelAttribute
    public RequestSurvey requestSurvey() {
        return new RequestSurvey();
    }

    @GetMapping("/step1")
    public String step1() {

        return "survey/step1";
    }

    @PostMapping("/step2")
    public String step2(RequestSurvey form, @SessionAttribute("requestSurvey") RequestSurvey form2) {

        log.info("form : " + form.toString());
        log.info("form2 : " + form2.toString());

        return "survey/step2";
    }

    @PostMapping("/step3")
    public String step3(RequestSurvey form, @SessionAttribute("requestSurvey") RequestSurvey form2, SessionStatus status, HttpServletRequest request) {

        log.info("form : " + form.toString());
        log.info("form2 : " + form2.toString());

        status.setComplete(); // 세션 비우기 - requestSurvey 세션 비우기

        System.out.println("세션 비우기 후: " + request.getSession().getAttribute("requestSurvey"));

        return "survey/step3";
    }
}
