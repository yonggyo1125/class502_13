package org.choongang.member.controllers;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class MemberController {

    //@GetMapping("/member/join")
    @RequestMapping(path="/member/join", method = {RequestMethod.GET, RequestMethod.POST})
    public String join(Model model, HttpServletRequest request) {

        model.addAttribute("message", "안녕하세요.");
        System.out.println("method : " + request.getMethod());

        return "member/join";
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
