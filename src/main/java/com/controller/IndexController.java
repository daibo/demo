package com.controller;

import com.model.DataBaseArticleDetials_M;
import com.service.Index_S;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

/**
 * Created by daibo on 2017/8/31.
 */
@Controller
public class IndexController {
    private static Logger logger = LoggerFactory.getLogger(IndexController.class);
    @Autowired
    Index_S index_S;
    @RequestMapping(value = "index")
    public String getIndex(Model model) {
        Map<String, Object> map = index_S.getIndex_articleInfoList();
        List<DataBaseArticleDetials_M> IndexArticleList = (List<DataBaseArticleDetials_M>) map.get("IndexArticleList");
        model.addAttribute("IndexArticleList", IndexArticleList);
        return "index";
    }


}
