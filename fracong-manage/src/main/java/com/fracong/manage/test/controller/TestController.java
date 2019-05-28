package com.fracong.manage.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.fracong.manage.test.service.TestService;
import com.fracong.test.entity.Test;

@RestController
@RequestMapping("/test")
public class TestController {
	@Autowired
	private TestService testService;
	
	/**
	 * 普通测试mybatis
	 * @param id
	 * @return
	 */
	@GetMapping("/mytest/{id}")
	public String test(@PathVariable(name="id") String id){
		Test test = testService.test(id);
		return JSON.toJSONString(test);
	}
	
	/**
	 * 调用RestTemplate
	 * @param id
	 * @return
	 */
	@GetMapping("/testR/{id}")
	public String testRestTemplate(@PathVariable(name="id") String id){
		Test test = testService.testRestTemplate(id);
		return JSON.toJSONString(test);
	}
	
	/**
	 * 调用Feign
	 * @param id
	 * @return
	 */
	@GetMapping("/testFeign/{id}")
	public String testFeign(@PathVariable(name="id") String id){
		String testFeign = testService.testFeign(id);
		return testFeign;
	}
}
