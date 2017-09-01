package com.model;

/**
 * Created by daibo on 2017/9/1.
 */
public class Index_blogAuthor_M {
    private String userName;
    private String skill;
    private String motto;

    @Override
    public String toString() {
        return "Index_blogAuthor_M{" +
                "userName='" + userName + '\'' +
                ", skill='" + skill + '\'' +
                ", motto='" + motto + '\'' +
                '}';
    }

    public Index_blogAuthor_M(String userName, String skill, String motto) {
        this.userName = userName;
        this.skill = skill;
        this.motto = motto;
    }

    public Index_blogAuthor_M() {

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }
}
