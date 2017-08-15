package com.service;

import com.dao.D_blog_details;
import com.model.M_blog_details;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by daibo on 2017/8/15.
 */
@Service
public class Blog_service {
    private Logger log = LoggerFactory.getLogger(Blog_service.class);
    @Autowired
    D_blog_details d_blog_details;

    public List<M_blog_details> getBlogsMainInfo(int start, int limit) {
        return d_blog_details.queryForBlogsByLimit(start, limit);
    }

    public List<M_blog_details> getBlogsMainInfoById(String id) {
        return d_blog_details.queryForBlogsById(id);
    }
}
