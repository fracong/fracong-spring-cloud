package com.fracong.manage.elasticsearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.fracong.manage.elasticsearch.entity.SearchTest;
import com.fracong.manage.elasticsearch.service.SearchService;

@RestController
@RequestMapping("/es")
public class SearchController {
	@Autowired
	private SearchService searchService;
	
	@RequestMapping("/put/{id}/{name}/{enName}")
	public String testPut(@PathVariable(name="id") String id,@PathVariable(name="name") String name,@PathVariable(name="enName") String enName){
		String test = searchService.testPut(id, name, enName);
		return JSON.toJSONString(test);
	}
	
	@RequestMapping("/get/{id}")
	public String testGet(@PathVariable(name="id") String id){
		SearchTest test = searchService.testGet(id);
		return JSON.toJSONString(test);
	}
}
