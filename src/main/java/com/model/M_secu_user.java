package com.model;

/**
 * Created by daibo on 2017/8/4.
 */
public class M_secu_user {
    //user_id  user_name  pass_word  pass_key
    private String user_id;
    private String user_name;
    private String pass_word;
    private String pass_key;
    private String role_id;

    public M_secu_user(String user_id, String user_name, String pass_word, String pass_key, String role_id) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.pass_word = pass_word;
        this.pass_key = pass_key;
        this.role_id = role_id;
    }

    public M_secu_user() {
    }

    @Override
    public String toString() {
        return "M_secu_user{" +
                "user_id='" + user_id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", pass_word='" + pass_word + '\'' +
                ", pass_key='" + pass_key + '\'' +
                ", role_id='" + role_id + '\'' +
                '}';
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPass_word() {
        return pass_word;
    }

    public void setPass_word(String pass_word) {
        this.pass_word = pass_word;
    }

    public String getPass_key() {
        return pass_key;
    }

    public void setPass_key(String pass_key) {
        this.pass_key = pass_key;
    }
}
