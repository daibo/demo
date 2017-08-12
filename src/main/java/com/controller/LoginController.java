package com.controller;

import com.Auth.PubliDic;
import com.dao.D_secu_user;
import com.model.M_login_user;
import com.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by daibo on 2017/8/10.
 */
@Controller
@EnableAutoConfiguration
public class LoginController {
    private Logger log = LoggerFactory.getLogger("LoginController.class");
    M_login_user m_login_user = new M_login_user();
    @Autowired
    D_secu_user d_user;
    @Autowired
    LoginService loginService;


    @RequestMapping(value = "login")
    public String LoginIn(@Valid M_login_user m_login_user, HttpSession session, Model model) {
        if(session.getAttribute(PubliDic.USER_ID)!=null){
            return "index";
        }
        model.addAttribute("M_login_user", m_login_user);
        model.addAttribute(PubliDic.MSG, "请登录");
        log.info("验证登录"+m_login_user.toString());
        if(m_login_user.getUserName()!=null){
            if (loginService.loginAuth(m_login_user, session)) {
                log.info("登录成功");
                model.addAttribute(PubliDic.MSG, "登录成功");
                return "index";
            } else {
                log.info("登录失败");
                model.addAttribute(PubliDic.MSG, "登录失败");
            }
        }
        return "login";
    }

    @RequestMapping(value = "loginOut")
    public String loginOut(@Valid M_login_user m_login_user, HttpSession session, Model model) {
        model.addAttribute(PubliDic.MSG, "请登录");
        log.info("退出登录");
        session.removeAttribute(PubliDic.USER_ID);
        return "login";
    }

}
