package com.controller;

import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by daibo on 2017/7/21.
 * index控制器
 */
@Controller
@EnableAutoConfiguration
public class IndexController {
    private org.slf4j.Logger log = LoggerFactory.getLogger("IndexController.class");

    @RequestMapping(value = "index")
    public String Index(HttpSession session) {
        log.info("你进入的index控制器");
        return "index";
    }

}
