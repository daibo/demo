package com.service;

import com.Util.Util;
import com.dao.Article_detials_D;
import com.model.DataBaseArticleDetials_M;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by daibo on 2017/9/2.
 */
@Service
public class Article_view_S {
    @Autowired
    Article_detials_D article_detials_D;
    public DataBaseArticleDetials_M getArticleById(String id) {
        DataBaseArticleDetials_M m = this.article_detials_D.getArticleById(id);
        m.setArticle(Util.HtmlEncode(m.getArticle()));
        return m;
    }
}
