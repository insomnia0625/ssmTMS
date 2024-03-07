package com.cqupt.common;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AuthIntercepter implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        if(session.getAttribute("username") == null){
            //true继续往后执行，false不再往后执行
            response.sendRedirect(request.getContextPath()+"/login");
            return false;
        }else {
            return true;
        }
    }
}
