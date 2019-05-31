package com.fracong.manage.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.fracong.manage.test.annotation.MessageAnnotation;
import com.fracong.manage.test.annotation.NeedAspest;
import com.fracong.manage.test.annotation.NeedAspestOnMethod;
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
	@NeedAspestOnMethod
	@NeedAspest
	@MessageAnnotation(getMessage="普通测试mybatis")
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
	
	/**
	 * 调用ehcache
	 * @param id
	 * @return
	 */
	@NeedAspestOnMethod
	@GetMapping("/testEhCacheQ/{id}")
	public String testEhCacheQ(@PathVariable(name="id") String id){
		Test test = testService.testEhCacheQ(id);
		return JSON.toJSONString(test);
	}
	
	/**
	 * 调用ehcache
	 * @param id
	 * @return
	 */
	@NeedAspestOnMethod
	@GetMapping("/testKafka/{id}")
	public String testKafka(@PathVariable(name="id") String id){
		String test = testService.testKafka(id);
		return JSON.toJSONString(test);
	}
	
	/**
	 * 查询单个配置的值
	 * @param id
	 * @return
	 * @throws Exception 
	 */
	@GetMapping("/testConfig/{id}")
	public String testConfig(@PathVariable(name="id") String id) throws Exception{
		String test = testService.testConfig(id);
		return JSON.toJSONString(test);
	}
	
	/**
	 * 将本地配置写入zk
	 * @param id
	 * @return
	 * @throws Exception 
	 */
	@GetMapping("/updateConfig")
	public String updateConfig() throws Exception{
		String test = testService.updateConfig();
		return JSON.toJSONString(test);
	}
}
