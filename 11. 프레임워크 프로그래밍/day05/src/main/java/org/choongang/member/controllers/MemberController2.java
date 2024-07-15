package org.choongang.member.controllers;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Locale;

@Slf4j
@Controller
@RequestMapping("/member2")
@RequiredArgsConstructor
public class MemberController2 {

    private final MessageSource messageSource;
    private final HttpServletRequest request;

    @ModelAttribute("commonValue")
    public String commonValue() {
        return "공통 속성값...";
    }

    @ModelAttribute("hobbies")
    public List<String> hobbies() {
        return List.of("취미1", "취미2", "취미3", "취미4");
    }

    @ModelAttribute("hobbies2")
    public List<CodeValue> hobbies2() {
        return List.of(
                new CodeValue("취미1", "hobby1"),
                new CodeValue("취미2", "hobby2"),
                new CodeValue("취미3", "hobby3"),
                new CodeValue("취미4", "hobby4")
        );
    }

    @GetMapping("/join")
    public String join(@ModelAttribute RequestJoin form) {

        Locale locale = request.getLocale(); // 요청 헤더 Accept-Language
        String message = messageSource.getMessage("EMAIL", null, locale);
        log.info(message);

        return "member/join";
    }

    @PostMapping("/join")
    public String joinPs(RequestJoin form) {

        log.info(form.toString());

        return "member/join";
    }

    @GetMapping("/login")
    public String login(RequestLogin2 form) {

        if (form != null) {
            log.info("이메일:{}, 비밀번호: {}", form.email(), form.password());
        }

        return "member/login";
    }

    //private final Logger log = LoggerFactory.getLogger(MemberController.class);
    /*

    @GetMapping("/join")
    public String join(Model model) {

        RequestJoin form = new RequestJoin();
        model.addAttribute("requestJoin", form);

        return "member/join";
    }
    @PostMapping("/join")
    public String joinPs(RequestJoin form) {

       //return "redirect:/member/login"; // Location: /day05/member/login
        return "forward:/member/login"; // 버퍼 치환
    }
    @GetMapping("/join")
    public String join1() {

        log.info("{}, {} 없음", "mode1", "mode2");

        return "member/join";
    }

    @GetMapping(path="/join", params={"mode=join"})
    public String join() {

        log.info("mode=join");

        return "member/join";
    }



    @PostMapping(path="/join", headers="appKey=1234", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String joinPs(RequestJoin form) {

        log.info("joinPs 실행...");

        return "redirect:/member/login";
    }
    */
    /*
    @GetMapping("/member/join")
    public ModelAndView join() {

        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "안녕하세요.");
        mv.setViewName("member/join");

        return mv;
    }*/
}
