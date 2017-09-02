package com.service;

import com.Util.Util;
import com.dao.Article_detials_D;
import com.model.DataBaseArticleDetials_M;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by daibo on 2017/9/2.
 */
@Service
public class Index_S {
    @Autowired
    Article_detials_D article_detials_D;

    public List<DataBaseArticleDetials_M> getArticle(){
        return this.article_detials_D.getArticle();
    }

    public Map<String, Object> getIndex_articleInfoList() {
        Map<String,Object> map =new HashMap<>();
        List<DataBaseArticleDetials_M> DataBaseArticleDetials_M_lists = this.article_detials_D.getArticle();
        //获取首页文章列表
        List<DataBaseArticleDetials_M> IndexArticleList = new ArrayList<>();
        IndexArticleList=DataBaseArticleDetials_M_lists;
        map.put("IndexArticleList",IndexArticleList);
       return map;

    }

}
