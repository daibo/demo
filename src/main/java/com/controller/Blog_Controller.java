package com.controller;

import com.Auth.PubliDic;
import com.model.M_blog_details;
import com.service.Blog_service;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

/**
 * Created by daibo on 2017/8/12.
 */
@Controller(value="blog")
@EnableAutoConfiguration
@RequestMapping(value = "blog")
public class Blog_Controller {
    private org.slf4j.Logger log = LoggerFactory.getLogger("home_controller_blog.class");
@Autowired
    Blog_service blog_service;
    @RequestMapping(value = "index")
    public String Home_index(HttpServletRequest req, Model model){
        log.info("进入blog****************");
        List<M_blog_details> lists = blog_service.getBlogsMainInfo(0,8);
        log.info("查询到的文章内容::::::"+lists.toString());
        model.addAttribute("lists",lists);
        return "blog_index";
    }
    //project
    @RequestMapping(value = "project")
    public String project(HttpSession session, Model model, HttpServletRequest req, HttpServletResponse resp){

        if(null==req.getAttribute("blog")||"".equals(req.getAttribute("blog"))){
            model.addAttribute(PubliDic.MSG,"查询错误,查询的id为空");
            try {
                resp.sendRedirect("index");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        log.info("进入blog详情****************");
        String blogId =String.valueOf(req.getParameter("blog"));
        log.info("查询的文件为::::"+blogId);
        List<M_blog_details> lists =blog_service.getBlogsMainInfoById(blogId);
        log.info(lists.toString());
        model.addAttribute("blogDtails",lists.get(0));
        return "blog_project";
    }
}
