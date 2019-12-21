package com.fracong.blog.func.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.fracong.blog.func.user.entity.BlogUser;
import com.fracong.blog.func.user.service.UserService;
import com.fracong.blog.util.MD5Util;
import com.fracong.blog.util.RedisCacheType;
import com.fracong.blog.util.RedisUtil;
import com.fracong.blog.util.ResponseInfoUtil;
import com.fracong.blog.util.UserUtils;

@RestController
@RequestMapping("/user")
public class UserController {
	private Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userService;
	@Autowired
	private RedisUtil redisUtil;
	
	@PostMapping("/login")
	public String login(@RequestBody BlogUser user, HttpServletRequest request, HttpServletResponse response){
		String loginMessage = ResponseInfoUtil.LOGIN_ERROR;
		JSONObject object = new JSONObject();
		try {
			BlogUser dbUser = null;
			String loginName = user.getLoginName();
			String userPassword = user.getUserPassword();
			if(StringUtils.isNotBlank(loginName) && StringUtils.isNotBlank(userPassword) && 
					loginName.length() >= 6 && loginName.length() <= 15 &&
					userPassword.length() >= 8 && userPassword.length() <= 30){
				dbUser = userService.selectByLoginName(loginName);
				if(dbUser != null && dbUser.getStatusFlag() == 0 && dbUser.getDeleteFlag() == 0) {
					loginMessage = ResponseInfoUtil.LOGIN_SUCCESS;
				}
			}
			if(this.loginMessageIsOk(loginMessage)) loginMessage = this.checkUserPassword(user, dbUser);
			if(this.loginMessageIsOk(loginMessage)) loginMessage = this.insertSessionAndCache(dbUser, request, response);
			if(this.loginMessageIsOk(loginMessage)) object.put(ResponseInfoUtil.BEAN, dbUser);
		} catch (Exception e) {
			logger.error("UserController login", e);
		}
		object.put(ResponseInfoUtil.MESSSAGE_KEY, loginMessage);
		return JSON.toJSONStringWithDateFormat(object, ResponseInfoUtil.DATE_FORMAT, SerializerFeature.WriteMapNullValue);
	}
	
	private String insertSessionAndCache(BlogUser dbUser, HttpServletRequest request, HttpServletResponse response) {
		String message = ResponseInfoUtil.LOGIN_ERROR;
		try {
			UserUtils.saveUserSession(request, dbUser);
			String userStr = JSON.toJSONStringWithDateFormat(dbUser, ResponseInfoUtil.DATE_FORMAT, SerializerFeature.WriteMapNullValue);
			redisUtil.setex(request.getRequestedSessionId(), userStr, 3600);
			message = ResponseInfoUtil.LOGIN_SUCCESS;
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return message;
	}

	private String checkUserPassword(BlogUser user, BlogUser dbUser) {
		String message = ResponseInfoUtil.LOGIN_ERROR;
		String loginPassword = user.getUserPassword();
		String passwordCrypt = dbUser.getUserPassword();
		if(StringUtils.isNotBlank(passwordCrypt) && MD5Util.verify(loginPassword, passwordCrypt)){
			message = ResponseInfoUtil.LOGIN_SUCCESS;
		}
		return message;
	}

	private boolean loginMessageIsOk(String loginMessage) {
		return ResponseInfoUtil.LOGIN_SUCCESS.equals(loginMessage);
	}
	
	
	@GetMapping("/checkLogin")
	public String checkLogin(HttpServletRequest request) {
		JSONObject object = new JSONObject();
		object.put(ResponseInfoUtil.MESSSAGE_KEY, ResponseInfoUtil.MESSSAGE_EROOR);
		BlogUser userSession = UserUtils.getUserSession(request);
		if(userSession != null) {
			object.put(ResponseInfoUtil.MESSSAGE_KEY, ResponseInfoUtil.MESSSAGE_SUCCESS);
			object.put(ResponseInfoUtil.BEAN, userSession);
		}else{
			String requestedSessionId = request.getRequestedSessionId();
			String userStr = redisUtil.get(requestedSessionId, 0);
			if(StringUtils.isNotBlank(userStr)){
				BlogUser blogUser = JSON.parseObject(userStr, BlogUser.class);
				UserUtils.saveUserSession(request, blogUser);
				object.put(ResponseInfoUtil.MESSSAGE_KEY, ResponseInfoUtil.MESSSAGE_SUCCESS);
				object.put(ResponseInfoUtil.BEAN, blogUser);
			}
		}
		return JSON.toJSONStringWithDateFormat(object, ResponseInfoUtil.DATE_FORMAT, SerializerFeature.WriteMapNullValue);
	}
}
