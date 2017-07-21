package com.Pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by daibo on 2017/7/21.
 */
@Component
public class UserPojo {
    @Value("${name}")
    private String userName;
    @Value("${title}")
    private String Title;

    public UserPojo() {
        super();
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
