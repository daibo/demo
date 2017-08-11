package com.controller;

import com.Auth.PubliDic;
import com.dao.D_secu_user;
import com.model.M_login_user;
import com.model.M_secu_user;
import com.service.LoginService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * Created by daibo on 2017/8/10.
 */
@Controller
@EnableAutoConfiguration
public class LoginController {
    private Logger log = LoggerFactory.getLogger("LoginController.class");
    M_login_user m_login_user =new M_login_user();
    @Autowired
    D_secu_user d_user;
    @Autowired
    LoginService loginService;
    @RequestMapping(value = "login")
    public String loginWeb(Model model) {
        model.addAttribute("M_login_user",m_login_user);
        return "login";
    }

    @RequestMapping(value = "loginIn")
    public String LoginIn(@Valid M_login_user  m_login_user ,HttpSession session,Model model) {
        log.info("验证登录");
        if(loginService.loginAuth(m_login_user,session)){
            log.info("登录成功");
            model.addAttribute(PubliDic.MSG,"登录成功");
        }else{
            log.info("登录失败");
            model.addAttribute(PubliDic.MSG,"登录失败");
        }
        return "login";
    }

}
