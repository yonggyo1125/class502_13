package org.choongang.survey.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/survey")
public class SurveyController {

    @GetMapping("/step1")
    public String step1(@ModelAttribute RequestSurvey form) {

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
