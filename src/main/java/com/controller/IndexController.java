package com.controller;

import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by daibo on 2017/7/21.
 * index控制器
 */
@Controller
@EnableAutoConfiguration
public class IndexController {
    private org.slf4j.Logger log = LoggerFactory.getLogger("this.class");


    @RequestMapping(value = "index")
    public String Index(HttpSession session ) {
        log.info("你进入的index控制器");
        return "index";
    }

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String hello( ModelMap map,HttpSession session ,String userName ) {
        session.setAttribute("name",userName);
        String name =session.getAttribute("name").toString();
        map.addAttribute("name","你好");
        map.addAttribute("name_from_session",name);
        return "hello";
    }

}
