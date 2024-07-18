package org.choongang.member.api.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.choongang.config.MvcConfig;
import org.choongang.member.controllers.RequestJoin;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringJUnitWebConfig
@ContextConfiguration(classes= MvcConfig.class)
public class ApiMemberControllerTest {

    private MockMvc mockMvc;

    //@Autowired
    //private ApiMemberController controller;

    @Autowired
    private WebApplicationContext ctx;

    @BeforeEach
    void init() {
        //mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        mockMvc = MockMvcBuilders.webAppContextSetup(ctx).build();
    }

    @Test
    void test1() throws Exception {
        // Content-Type: application/json

        ObjectMapper om = new ObjectMapper();
        om.registerModule(new JavaTimeModule());

        RequestJoin form = new RequestJoin();
        form.setEmail("user100@test.org");
        form.setPassword("12345678");
       // form.setConfirmPassword("12345678");
        //form.setUserName("사용자100");
        form.setAgree(true);

        String json = om.writeValueAsString(form);
        mockMvc.perform(
                        post("/api/member")
                        .contentType(MediaType.APPLICATION_JSON) // 요청 헤더
                        .content(json) // 요청 바디
                ).andDo(print())
                .andExpect(status().isCreated());


        // Content-Type: application/x-www-form-urlencoded
        // 이름=값&이름=값...
        /*
        mockMvc.perform(
                  post("/api/member")
                .param("email", "user99@test.org")
                .param("password", "12345678")
                .param("confirmPassword", "12345678")
                .param("userName", "사용자99"))
                .andDo(print());

         */
    }

    @Test
    void test2() throws Exception {
        mockMvc.perform(get("/api/member/list"))
                .andDo(print());
    }
}
