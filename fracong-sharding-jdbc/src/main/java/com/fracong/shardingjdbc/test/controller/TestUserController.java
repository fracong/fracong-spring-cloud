package com.fracong.shardingjdbc.test.controller;

import java.io.IOException;
import java.io.Writer;
import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fracong.shardingjdbc.test.entity.LocalDateTimeEntity;
import com.fracong.shardingjdbc.test.entity.TestFracong;
import com.fracong.shardingjdbc.test.entity.TestUser;
import com.fracong.shardingjdbc.test.entity.TestWeb;
import com.fracong.shardingjdbc.test.service.TestUserService;

@RestController
@RequestMapping("/testuser")
public class TestUserController {
	private static final Logger logger = LoggerFactory.getLogger(TestUserController.class);
	@Autowired
	private TestUserService testUserService;
	
	@GetMapping("/insert/{id}/{sex}/{name}")
	public String test1(@PathVariable(name="id") Integer id,@PathVariable(name="sex") Integer sex,
			@PathVariable(name="name") String name){
		String test = testUserService.insertUser(id,sex,name);
		return JSON.toJSONString(test);
	}
	
	@GetMapping("/select/{id}/{password}")
	public String test2(@PathVariable(name="id") Integer id,@PathVariable(name="password") String sex){
		TestUser test = testUserService.selectUser(id,sex);
		return JSON.toJSONString(test);
	}
	
	@GetMapping("/selectFracong/{id}")
	public String test3(@PathVariable(name="id") Integer id){
		TestFracong test = testUserService.selectFracong(id);
		return JSON.toJSONString(test);
	}
	
	@GetMapping("/insertTestWeb/{sq}/{num}/{type}/{name}/{value}/{key}/{page}/{base}")
	public String test4(@PathVariable(name="sq") String sq,@PathVariable(name="num") String num,
			@PathVariable(name="type") String type, @PathVariable(name="name") String name,
			@PathVariable(name="value") String value, @PathVariable(name="key") String key,
			@PathVariable(name="page") String page, @PathVariable(name="base") String base){
		TestWeb web = new TestWeb();
		web.setSq(sq);
		web.setNum(num);
		web.setWebType(type);
		web.setWebName(name);
		web.setValue(value);
		web.setWebKey(key);
		web.setPage(page);
		web.setBase(base);
		testUserService.insertTestWeb(web);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("flag", "success");
		return jsonObject.toJSONString();
	}
	
	@PostMapping("/insertTestWeb")
	public String test4(@RequestBody TestWeb web){
		testUserService.insertTestWeb(web);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("flag", "success");
		return JSON.toJSONString(jsonObject);
	}
	
	@PostMapping("/insertTestWeb2") 
	public String test6(@RequestParam(name = "sq") String sq, @RequestParam(name = "webNum") String num, 
			@RequestParam(name = "webName") String name, @RequestParam(name = "key") String key, 
			@RequestParam(name = "value") String value, @RequestParam(name = "webType") String type,
			@RequestParam(name = "page") String page, @RequestParam(name = "base") String base){
		TestWeb web = new TestWeb();
		web.setSq(sq);
		web.setNum(num);
		web.setWebName(name);
		web.setWebKey(key);
		web.setValue(value);
		web.setWebType(type);
		web.setPage(page);
		web.setBase(base);
		testUserService.insertTestWeb(web);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("flag", "success");
		return jsonObject.toJSONString();
	}
	
	@GetMapping("/queryTestWeb/list/{sq}/{num}/{type}/{name}/{pageInfoRows}/{pageInfoNum}")
	public String test5(@PathVariable(name="sq") String sq,@PathVariable(name="num") String num,
			@PathVariable(name="type") String type, @PathVariable(name="name") String name,
			@PathVariable(name="pageInfoNum") Integer pageInfoNum,@PathVariable(name="pageInfoRows") Integer pageInfoRows){
		TestWeb testWeb = new TestWeb();
		if(StringUtils.isNotBlank(sq) && !"FFFFFFFF".equals(sq)) testWeb.setSq(sq);
		if(StringUtils.isNotBlank(num) && !"FFFFFFFF".equals(num)) testWeb.setNum(num);
		if(StringUtils.isNotBlank(type) && !"FFFFFFFF".equals(type)) testWeb.setWebType(type);
		if(StringUtils.isNotBlank(name) && !"FFFFFFFF".equals(name)) testWeb.setWebName(name);
		testWeb.setPageInfoNum(pageInfoNum);
		testWeb.setPageInfoRows(pageInfoRows);
		List<TestWeb> list = testUserService.queryTestWebList(testWeb);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("list", list);
		jsonObject.put("flag", "success");
		Integer total = testUserService.countTestWebList(testWeb);
		jsonObject.put("total", total);
		return jsonObject.toJSONString();
	}
	
	@RequestMapping("/jsonp/user/{id}")
	public void test7(HttpServletResponse response, @RequestParam(name = "callback") String callbackName,
			@PathVariable(name = "id") Integer id) {
		response.setContentType("text/javascript");
		TestFracong test = testUserService.selectFracong(id);
		Writer writer = null;
		try {
			writer = response.getWriter();
			writer.write(callbackName + "(");
			writer.write(JSON.toJSONString(test));
			writer.write(");");
		} catch (IOException e) {
			logger.error("jsonp Error：" + JSON.toJSONString(test), e);
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					logger.error("writer close error！", e);
				}
				writer = null;
			}
		}
	}
	
	@GetMapping("/localDateTime/out")
	public LocalDateTimeEntity testLocalDateTime1() {
		LocalDateTimeEntity entity = new LocalDateTimeEntity();
		entity.setLocalDateTime(LocalDateTime.now());
		return entity;
	}
	
	@PostMapping("/localDateTime/in")
	public String testLocalDateTime2(@RequestBody LocalDateTimeEntity entity) {
		System.err.println(entity.getLocalDateTime2());
		return "ok";
	}
}
