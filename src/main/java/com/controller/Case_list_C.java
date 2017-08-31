package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by daibo on 2017/8/31.
 */
@Controller
public class Case_list_C {
    @RequestMapping(value = "case_list")
    public String case_list(){
        return "case_list";
    }
}
