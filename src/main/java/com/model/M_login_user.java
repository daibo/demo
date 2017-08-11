package com.model;

/**
 * Created by daibo on 2017/8/11.
 */
public class M_login_user {
    private String userName;
    private String passWord;

    public M_login_user() {

    }

    @Override
    public String toString() {
        return "M_login_user{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public M_login_user(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }
}
