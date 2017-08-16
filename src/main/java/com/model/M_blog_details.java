package com.model;

/**
 * Created by daibo on 2017/8/15.
 */
public class M_blog_details {
    // `blog_id`,`blogTitle`,`blogImgAddr`,`blogContext`,`blogAuthor`,`time`
    private String blog_id;
    private String blogTitle;
    private String blogImgAddr;
    private String blogContext;
    private String blogAuthor;
    private String time;
    private String user_icon;

    @Override
    public String toString() {
        return "M_blog_details{" +
                "blog_id='" + blog_id + '\'' +
                ", blogTitle='" + blogTitle + '\'' +
                ", blogImgAddr='" + blogImgAddr + '\'' +
                ", blogContext='" + blogContext + '\'' +
                ", blogAuthor='" + blogAuthor + '\'' +
                ", time='" + time + '\'' +
                ", user_icon='" + user_icon + '\'' +
                '}';
    }

    public M_blog_details(String blog_id, String blogTitle, String blogImgAddr, String blogContext, String blogAuthor, String time, String user_icon) {
        this.blog_id = blog_id;
        this.blogTitle = blogTitle;
        this.blogImgAddr = blogImgAddr;
        this.blogContext = blogContext;
        this.blogAuthor = blogAuthor;
        this.time = time;
        this.user_icon = user_icon;
    }

    public String getUser_icon() {
        return user_icon;
    }

    public void setUser_icon(String user_icon) {
        this.user_icon = user_icon;
    }

    public String getBlog_id() {
        return blog_id;
    }

    public void setBlog_id(String blog_id) {
        this.blog_id = blog_id;
    }

    public M_blog_details() {
    }


    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    public String getBlogImgAddr() {
        return blogImgAddr;
    }

    public void setBlogImgAddr(String blogImgAddr) {
        this.blogImgAddr = blogImgAddr;
    }

    public String getBlogContext() {
        return blogContext;
    }

    public void setBlogContext(String blogContext) {
        this.blogContext = blogContext;
    }

    public String getBlogAuthor() {
        return blogAuthor;
    }

    public void setBlogAuthor(String blogAuthor) {
        this.blogAuthor = blogAuthor;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
