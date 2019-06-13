package com.fracong.shardingjdbc.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.fracong.shardingjdbc.test.entity.TestFracong;
import com.fracong.shardingjdbc.test.entity.TestUser;
import com.fracong.shardingjdbc.test.service.TestUserService;

@RestController
@RequestMapping("/testuser")
public class TestUserController {

	@Autowired
	private TestUserService testUserService;
	
	@GetMapping("/insert/{id}/{sex}/{name}")
	public String test1(@PathVariable(name="id") Integer id,@PathVariable(name="sex") Integer sex,
			@PathVariable(name="name") String name){
		String test = testUserService.insertUser(id,sex,name);
		return JSON.toJSONString(test);
	}
	
	@GetMapping("/select/{id}/{sex}")
	public String test2(@PathVariable(name="id") Integer id,@PathVariable(name="sex") Integer sex){
		TestUser test = testUserService.selectUser(id,sex);
		return JSON.toJSONString(test);
	}
	
	@GetMapping("/selectFracong/{id}")
	public String test3(@PathVariable(name="id") Integer id){
		TestFracong test = testUserService.selectFracong(id);
		return JSON.toJSONString(test);
	}
}
