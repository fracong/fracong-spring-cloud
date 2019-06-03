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
	
	/**
	 * 测试FeignClien的使用
	 * @return
	 */
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
	
	/**
	 * 测试RabbitMQ
	 * @param id
	 * @return
	 */
	@GetMapping("/testRabbitMQ/{id}")
	public String testRabbitMQ(@PathVariable(name="id") String id){
		String test = myTestService.testRabbitMQ(id);
		System.err.println(JSON.toJSONString(test));
		return JSON.toJSONString(test);
	}
	
	/**
	 * 测试邮件的发送
	 * @param id
	 * @return
	 */
	@GetMapping("/sendMail/{id}")
	public String sendMail(@PathVariable(name="id") String id){
		String test = myTestService.sendMail(id);
		return JSON.toJSONString(test);
	}
	
	/**
	 * 测试redis-put
	 * @param id
	 * @return
	 */
	@GetMapping("/testRedis/{id}")
	public String testRedisPut(@PathVariable(name="id") String id){
		String test = myTestService.testRedisPut(id);
		return JSON.toJSONString(test);
	}
	
	/**
	 * 测试redis get
	 * @param id
	 * @return
	 */
	@GetMapping("/testRedisGet/{id}")
	public String testRedisGet(@PathVariable(name="id") String id){
		String test = myTestService.testRedisGet(id);
		return JSON.toJSONString(test);
	}
}
