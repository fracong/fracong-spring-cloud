package com.fracong.service.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.fracong.service.test.service.MyTestService;
import com.fracong.test.entity.Test;

@RestController
@RequestMapping("/mytest")
public class MyTestContoller {
	@Autowired
	private MyTestService myTestService;
	
	@GetMapping("/test/{id}")
	public String test(@PathVariable(name="id") String id){
		Test test = myTestService.test(id);
		System.err.println(JSON.toJSONString(test));
		return JSON.toJSONString(test);
	}
	
	@GetMapping("/testFeign")
	public String testFeign(){
		Test test = myTestService.test("1");
		System.err.println(JSON.toJSONString(test));
		return JSON.toJSONString(test);
	}
	
	/**
	 * 测试activeMQ
	 * @param id
	 * @return
	 */
	@GetMapping("/testActiveMQ/{id}")
	public String testActiveMQ(@PathVariable(name="id") String id){
		String test = myTestService.testActvieMq(id);
		System.err.println(JSON.toJSONString(test));
		return JSON.toJSONString(test);
	}
}
