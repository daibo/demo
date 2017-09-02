package com.dao;

import com.model.DataBaseArticleDetials_M;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;


import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * Created by daibo on 2017/9/2.
 */
@Repository
public class Article_detials_D {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<DataBaseArticleDetials_M> getArticle() {
        String sql = "SELECT `id`,`title`,`author`,`article`,`tips`,`isTop`,`isDel`,`articleType`,`launchTime`,`updateTime` FROM demo.`article_detials`  ORDER BY launchTime DESC";
        return jdbcTemplate.query(sql,new DataBaseArticleDetials_M());
    }

    public DataBaseArticleDetials_M getArticleById(String id) {
        String sql = "SELECT `id`,`title`,`author`,`article`,`tips`,`isTop`,`isDel`,`articleType`,`launchTime`,`updateTime` FROM demo.`article_detials` WHERE  id =?";
        return (DataBaseArticleDetials_M)jdbcTemplate.queryForObject(sql,new DataBaseArticleDetials_M(),new Object[]{id});
    }
}
