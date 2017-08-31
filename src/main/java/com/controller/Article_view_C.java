package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by daibo on 2017/8/31.
 */
@Controller
public class Article_view_C {
    @RequestMapping(value = "article_view")
    public String article_view(){
        return "article_view";
    }
}
