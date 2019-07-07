package com.xj.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;



public class LoginInterceptor extends HandlerInterceptorAdapter {
  
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		HttpSession session = request.getSession();
		if (session.getAttribute("Admin") != null) {
			return true;
		} else {
			//如果没有登录，跳转至登录页面
		    request.setAttribute("msg", "请先登录");
			response.sendRedirect("/SSMTest/index.jsp");
			return false;
		}
	}
}
