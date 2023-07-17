package com.lhmgiw.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "home.jsp";
    }

    @RequestMapping("/info")
    public String info() {
        return "info.jsp";
    }

    @RequestMapping("user")
    @ResponseBody
    public Principal user(Principal principal) {
        return principal;
    }
}
