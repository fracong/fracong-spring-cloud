package com.fracong.blog.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.fracong.blog.func.user.entity.BlogUser;

public class UserUtils {
	public static void saveUserSession(HttpServletRequest request, BlogUser blogUser){
		HttpSession session = request.getSession();
		session.setAttribute(RedisCacheType.USER_INFO.toString(), blogUser);
	}
	
	public static void removeUserSession(HttpServletRequest request){
		HttpSession session = request.getSession();
		session.removeAttribute(RedisCacheType.USER_INFO.toString());
	}
	
	public static BlogUser getUserSession(HttpServletRequest request){
		HttpSession session = request.getSession();
		BlogUser user_session = (BlogUser)session.getAttribute(RedisCacheType.USER_INFO.toString());
		return user_session;
	}
}
