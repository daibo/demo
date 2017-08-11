package com.service;

import com.Auth.PubliDic;
import com.dao.D_secu_user;
import com.model.M_login_user;
import com.model.M_secu_user;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by daibo on 2017/8/11.
 */

@Service
public class LoginService {
    private Logger log = LoggerFactory.getLogger(LoginService.class);
    @Autowired
    D_secu_user d_secu_user;

    public Boolean loginAuth(M_login_user loginUser, HttpSession session){
        String id =loginUser.getUserName();
        String psd =loginUser.getPassWord();
        List<M_secu_user> m_secu_userList =d_secu_user.getUserInfoById(id);
        if(m_secu_userList.size()!=1){
            return false;
        }
        M_secu_user m =m_secu_userList.get(0);
        if(m.getPass_word().equals(loginUser.getPassWord())){
            log.info(m.getUser_name());
            session.setAttribute(PubliDic.USER_ID,m.getUser_name());
            return true;
        }
        return false;
    }
}
