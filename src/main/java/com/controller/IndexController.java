package com.controller;

import com.Pojo.User;
import com.Pojo.UserPojo;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by daibo on 2017/7/21.
 */
@RestController
@EnableAutoConfiguration
public class IndexController {
    private org.slf4j.Logger log = LoggerFactory.getLogger("this.class");


    @RequestMapping(value = "index")
    public String Index() {
        log.info("你进入的index控制器");
        log.warn("测试日志进行本地存储");
        return "Hello";
    }

    @RequestMapping(value = "hello",method = RequestMethod.GET)
    public String hello( ) {

        return "hello";
    }
}
