package com.Auth;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 使用注解标注过滤器
 * <p>
 * WebFilter将一个实现了javax.servlet.Filter接口的类定义为过滤器 属性filterName声明过滤器的名称, 可选
 * 属性urlPatterns指定要过滤 的URL模式,也可使用属性value来声明.(指定要过滤的URL模式是必选属性)
 */
@WebFilter(filterName = "myFilter", urlPatterns = "/*")
public class MyFilter implements Filter {

    @Override
    public void destroy() {
        System.out.println("过滤器销毁");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        HttpSession session = ((HttpServletRequest) request).getSession();
        HttpServletResponse rsp = (HttpServletResponse) response;
        String url = ((HttpServletRequest) request).getRequestURI();
        //去除掉静态资源的过滤以及对于登录界面的过滤
        if (url.contains(".css") || url.contains("login") || url.contains(".js") || url.contains(".png") || url.contains(".jpg") || url.contains(".woff") || url.contains(".woff2")) {
            if (url.contains("login") && session.getAttribute("userName") != null) {
                System.out.println("用户已经登录___" + session.getAttribute("userName"));
                rsp.sendRedirect("index");
            }
        } else {
            if (session.getAttribute(PubliDic.USER_ID) == null || "".equals(session.getAttribute(PubliDic.USER_ID))) {
                System.out.println("用户未登录,访问的是" + url + "执行过滤操作,转向登录界面");
                rsp.sendRedirect("login");
            }
        }
        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("过滤器初始化");
    }

}