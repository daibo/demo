package com.model;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by daibo on 2017/9/2.
 */
public class DataBaseArticleDetials_M implements RowMapper {
    //`id`,`title`,`author`,`article`,`tips`,`isTop`,`isDel`,`articleType`,`launchTime`,`updateTime`
    private String id;
    private String title;
    private String author;
    private String article;
    private String tips;
    private String isTop;
    private String isDel;
    private String articleType;
    private String launchTime;
    private String updateTime;

    @Override
    public DataBaseArticleDetials_M mapRow(ResultSet rs, int i) throws SQLException {
        DataBaseArticleDetials_M m= new DataBaseArticleDetials_M();
        m.setId(rs.getString("id"));
        m.setTitle(rs.getString("title"));
        m.setAuthor(rs.getString("author"));
        m.setArticle(rs.getString("article"));
        m.setTips(rs.getString("tips"));
        m.setIsTop(rs.getString("isTop"));
        m.setIsDel(rs.getString("isDel"));
        m.setArticleType(rs.getString("articleType"));
        m.setLaunchTime(rs.getString("launchTime"));
        m.setUpdateTime(rs.getString("updateTime"));
        return m;
    }
    @Override
    public String toString() {
        return "DataBaseArticleDetials_M{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", article='" + article + '\'' +
                ", tips='" + tips + '\'' +
                ", isTop='" + isTop + '\'' +
                ", isDel='" + isDel + '\'' +
                ", articleType='" + articleType + '\'' +
                ", launchTime='" + launchTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }

    public DataBaseArticleDetials_M() {
    }

    public DataBaseArticleDetials_M(String id, String title, String author, String article, String tips, String isTop, String isDel, String articleType, String launchTime, String updateTime) {

        this.id = id;
        this.title = title;
        this.author = author;
        this.article = article;
        this.tips = tips;
        this.isTop = isTop;
        this.isDel = isDel;
        this.articleType = articleType;
        this.launchTime = launchTime;
        this.updateTime = updateTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public String getIsTop() {
        return isTop;
    }

    public void setIsTop(String isTop) {
        this.isTop = isTop;
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }

    public String getLaunchTime() {
        return launchTime;
    }

    public void setLaunchTime(String launchTime) {
        this.launchTime = launchTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }


}
