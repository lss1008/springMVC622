package com.sangeng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @PostMapping("/login")
    public String login(String username, String password, HttpSession session) {
        System.out.println(username);
        System.out.println(password);
        session.setAttribute("username", username);
        return "/WEB-INF/page/success.jsp";
    }

}
