package org.choongang.global.advices;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.choongang.global.exceptions.CommonException;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
//@ControllerAdvice("org.choongang")
public class CommonControllerAdvice {

    @ExceptionHandler(Exception.class)
    public ModelAndView errorHandler(Exception e, HttpServletRequest request, HttpServletResponse response, Model model) {
        e.printStackTrace();
        log.info("advice 유입");

        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR; // 500
        if (e instanceof CommonException commonException) {
           // CommonException commonException = (CommonException) e;
            status = commonException.getStatus();
        }

        ModelAndView mv = new ModelAndView();
        mv.setViewName("error/common");
        mv.setStatus(status);

        return mv;
    }
}
