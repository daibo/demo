package com.controller;

import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by daibo on 2017/8/12.
 */
@Controller(value="blog")
@EnableAutoConfiguration
@RequestMapping(value = "blog")
public class Blog_Controller {
    private org.slf4j.Logger log = LoggerFactory.getLogger("home_controller_blog.class");

    @RequestMapping(value = "index")
    public String Home_index(){
        log.info("进入blog****************");
        return "blog_index";
    }
    //project
    @RequestMapping(value = "project")
    public String project(){
        log.info("进入blog详情****************");
        return "blog_project";
    }
}
