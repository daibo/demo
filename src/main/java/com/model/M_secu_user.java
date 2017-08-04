package com.model;

/**
 * Created by daibo on 2017/8/4.
 */
public class M_secu_user {
    private String id;
    private String userCode;

    public M_secu_user() {
    }

    public M_secu_user(String id, String userCode) {
        this.id = id;
        this.userCode = userCode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
}
