package com.fracong.blog.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import com.alibaba.fastjson.JSON;
import com.fracong.blog.func.user.entity.BlogUser;
import com.fracong.blog.util.RedisCacheType;
import com.fracong.blog.util.RedisUtil;
import com.fracong.blog.util.UserUtils;

public class SessionIterceptor implements HandlerInterceptor{
	@Autowired
	private RedisUtil redisUtil;
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		if(handler instanceof HandlerMethod){
			try {
				HttpSession session = request.getSession();
				System.err.println(session.getId());
				BlogUser user_session = (BlogUser)session.getAttribute(RedisCacheType.USER_INFO.toString());
				if(user_session == null){
					String requestedSessionId = request.getRequestedSessionId();
					String userStr = redisUtil.get(requestedSessionId, 0);
					if(StringUtils.isNotBlank(userStr)){
						BlogUser blogUser = JSON.parseObject(userStr, BlogUser.class);
						UserUtils.saveUserSession(request, blogUser);
					}else{
						response.setHeader("Access-Control-Allow-Origin",request.getHeader("Origin"));
						response.setHeader("Access-Control-Allow-Credentials", "true");
						response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE,PUT");
						//response.setHeader("Access-Control-Allow-Headers", "x-requested-with,content-type,Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With'");
						return false;
					}
				}
			} catch (Exception e) {
				
			}
		}
		return true;
	}
}
