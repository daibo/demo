package com.dao;

import com.model.M_blog_details;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Created by daibo on 2017/8/15.
 */
@SpringBootApplication
public class D_blog_details {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private Logger log = LoggerFactory.getLogger(D_blog_details.class);

    public List<M_blog_details> queryForBlogsById(String id) {
        String sql = "SELECT `blog_id`,`blogTitle`,`blogImgAddr`,`blogContext`,`blogAuthor`,`time` FROM demo.`blog_details` bd WHERE bd.`blog_id`=?";
        return jdbcTemplate.query(sql, new Object[]{id}, (rs, rowNum) -> new M_blog_details(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
    }

    public List<M_blog_details> queryForBlogsByLimit(int start, int  limt) {
        String sql = "SELECT `blog_id`,`blogTitle`,`blogImgAddr`,`blogContext`,`blogAuthor`,`time` FROM demo.`blog_details` LIMIT ?,?";
        return jdbcTemplate.query(sql, new Object[]{start, limt}, (rs, rowNum) -> new M_blog_details(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
    }
}
