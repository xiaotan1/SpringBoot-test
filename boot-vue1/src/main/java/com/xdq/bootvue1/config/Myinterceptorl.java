package com.xdq.bootvue1.config;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * aop  拦截器
 * 拦截器中的方法将按 preHandle  -->  Controller -->  postHandle -->  afterCompletion 的顺序执行
 *
 * MyWebMvcConfig  需要在上面的，config中配置controller拦截
 */
public class Myinterceptorl implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("Myinterceptorl>>preHandle");
        //只有该方法返回 true 后续方法才会执行
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("Mylnterceptorl>>postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("Mylnterceptorl>>afterCompletion");
    }
}
