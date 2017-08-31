package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by daibo on 2017/8/31.
 */
@Controller
public class About_lzcms_C {
    @RequestMapping(value = "about_lzcms")
    public String about_lzcms(){
        return "about_lzcms";
    }
}
