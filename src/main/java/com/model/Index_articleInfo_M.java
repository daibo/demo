package com.model;

/**
 * Created by daibo on 2017/8/31. 为首页部分的列表实体类
 */
public class Index_articleInfo_M {
    private String article_adress;
    private String pic_adress;
    private String article_title;
    private String article_author;
    private String article_data;
    private String article_hitsNum;
    private String article_repliesNum;

    @Override
    public String toString() {
        return "Index_articleInfo_M{" +
                "article_adress='" + article_adress + '\'' +
                ", pic_adress='" + pic_adress + '\'' +
                ", article_title='" + article_title + '\'' +
                ", article_author='" + article_author + '\'' +
                ", article_data='" + article_data + '\'' +
                ", article_hitsNum='" + article_hitsNum + '\'' +
                ", article_repliesNum='" + article_repliesNum + '\'' +
                '}';
    }

    public Index_articleInfo_M() {
    }

    public Index_articleInfo_M(String article_adress, String pic_adress, String article_title, String article_author, String article_data, String article_hitsNum, String article_repliesNum) {

        this.article_adress = article_adress;
        this.pic_adress = pic_adress;
        this.article_title = article_title;
        this.article_author = article_author;
        this.article_data = article_data;
        this.article_hitsNum = article_hitsNum;
        this.article_repliesNum = article_repliesNum;
    }

    public String getArticle_adress() {

        return article_adress;
    }

    public void setArticle_adress(String article_adress) {
        this.article_adress = article_adress;
    }

    public String getPic_adress() {
        return pic_adress;
    }

    public void setPic_adress(String pic_adress) {
        this.pic_adress = pic_adress;
    }

    public String getArticle_title() {
        return article_title;
    }

    public void setArticle_title(String article_title) {
        this.article_title = article_title;
    }

    public String getArticle_author() {
        return article_author;
    }

    public void setArticle_author(String article_author) {
        this.article_author = article_author;
    }

    public String getArticle_data() {
        return article_data;
    }

    public void setArticle_data(String article_data) {
        this.article_data = article_data;
    }

    public String getArticle_hitsNum() {
        return article_hitsNum;
    }

    public void setArticle_hitsNum(String article_hitsNum) {
        this.article_hitsNum = article_hitsNum;
    }

    public String getArticle_repliesNum() {
        return article_repliesNum;
    }

    public void setArticle_repliesNum(String article_repliesNum) {
        this.article_repliesNum = article_repliesNum;
    }
}
