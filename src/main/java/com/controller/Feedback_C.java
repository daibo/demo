package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by daibo on 2017/8/31.
 */
@Controller
public class Feedback_C {
    @RequestMapping(value = "feedback")
    public String feedback(){
        return "feedback";
    }
}
