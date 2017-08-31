package com.controller;

import com.model.Index_articleInfo_M;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daibo on 2017/8/31.
 */
@Controller
public class IndexController {
    @RequestMapping(value = "index")
    public String getIndex(Model model) {
        List<Index_articleInfo_M> lists = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            lists.add(new Index_articleInfo_M(i + "", i + "", i + "", i + "", i + "", i + "", i + ""));
        }
        System.out.print(lists.toString());
        model.addAttribute("Index_articleInfoList", lists);
        return "index";
    }


}
