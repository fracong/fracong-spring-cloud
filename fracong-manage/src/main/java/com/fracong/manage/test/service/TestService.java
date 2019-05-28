package com.fracong.manage.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fracong.manage.test.controller.MyTestController;
import com.fracong.test.dao.TestMapper;
import com.fracong.test.entity.Test;

@Service
public class TestService {
	@Autowired
	private TestMapper testMapper;
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private MyTestController myTestController;

	public Test test(String id) {
		Test test = testMapper.selectByPrimaryKey(id);
		return test;
	}
	
	public Test testRestTemplate(String id){
		Test test = restTemplate.getForObject("http://localhost:8889/fracong-service/mytest/test/"+id, Test.class);
		return test;
	}
	
	public String testFeign(String id){
		String test = myTestController.testFeign();
		return test;
	}
}
