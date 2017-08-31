package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by daibo on 2017/8/31.
 */
@Controller
public class Article_list_C {
    @RequestMapping(value = "article_list")
    public String article_list(){
        return "article_list";
    }
}
