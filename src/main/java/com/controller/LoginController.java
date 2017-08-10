package com.controller;

import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by daibo on 2017/8/10.
 */
@Controller
@EnableAutoConfiguration
public class LoginController {
    private org.slf4j.Logger log = LoggerFactory.getLogger("LoginController.class");
    @RequestMapping(value="login")
    public String loginWeb(HttpSession session){
        return "login";
    }

    @RequestMapping(value="loginIn")
    public Boolean  LoginIn(HttpSession session){
        log.info("进入登录");
        session.setAttribute("userName","小明");
        return true;
    }
}
