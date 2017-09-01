package com.controller;

import com.model.Index_articleInfo_M;
import com.model.Index_articleTitleAdressHot_M;
import com.model.Index_blogAuthor_M;
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
        //侧边最新5
        List<Index_articleTitleAdressHot_M> top5_new = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            top5_new.add(new Index_articleTitleAdressHot_M( "最新文章"+i, i + "", i + "", i + ""));
        }
        model.addAttribute("top5_new", top5_new);
        //侧边Top5
        List<Index_articleTitleAdressHot_M> top5_hot = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            top5_hot.add(new Index_articleTitleAdressHot_M( "最热访问"+i, i + "", i + "", i + ""));
        }
        model.addAttribute("top5_hot", top5_hot);
        //添加博主信息
        model.addAttribute("userInfo", new Index_blogAuthor_M("姓名:宇智波瞎", "技能:装逼,二", "愚蠢的啊多多"));
        //添加文章列表
        List<Index_articleInfo_M> Index_articleInfoList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Index_articleInfoList.add(new Index_articleInfo_M(i + "", i + "", i + "", i + "", i + "", i + "", i + ""));
        }
        model.addAttribute("Index_articleInfoList", Index_articleInfoList);
        return "index";
    }


}
