package org.choongang.survey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    public String step2(RequestSurvey form) {

        return "survey/step2";
    }

    @PostMapping("/step3")
    public String step3(RequestSurvey form) {

        return "survey/step3";
    }
}
