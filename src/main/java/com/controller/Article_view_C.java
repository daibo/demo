package com.controller;

import com.service.Article_view_S;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by daibo on 2017/8/31.
 */
@Controller
public class Article_view_C {
    private static Logger logger = LoggerFactory.getLogger(Article_view_C.class);

    @Autowired
    Article_view_S article_view_S;

    @RequestMapping(value = "article_view/{id}")
    public String article_view(@PathVariable("id") String id, Model model) {
        logger.info("查询的文章id为:" + id);
        model.addAttribute("article", article_view_S.getArticleById(id));
        return "article_view";
    }
}
