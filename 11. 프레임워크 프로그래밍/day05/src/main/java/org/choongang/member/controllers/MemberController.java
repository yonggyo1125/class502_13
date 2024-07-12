package org.choongang.member.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/member")
public class MemberController {

    //private final Logger log = LoggerFactory.getLogger(MemberController.class);

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



    @PostMapping("/join")
    public String joinPs(RequestJoin form) {

        return "redirect:/member/login";
    }

    /*
    @GetMapping("/member/join")
    public ModelAndView join() {

        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "안녕하세요.");
        mv.setViewName("member/join");

        return mv;
    }*/
}
