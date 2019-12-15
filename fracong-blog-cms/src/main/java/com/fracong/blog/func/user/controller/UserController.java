package com.fracong.blog.func.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fracong.blog.util.ResponseInfoUtil;


@Controller
@RequestMapping("/user")
public class UserController {
	
	@PostMapping("/login")
	public String login(){
		String loginMessage = ResponseInfoUtil.LOGIN_ERROR;
		
		return loginMessage;
	}
}
