package com.fracong.manage.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.fracong.manage.test.service.TestProcedureService;

@RestController
@RequestMapping("/procedure")
public class TestProcedureController {
	@Autowired
	private TestProcedureService testProcedureService;
	
	@GetMapping("/testInsert/{id}/{name}")
	public String test(@PathVariable(name="id") String id, @PathVariable(name="name") String name){
		String test = testProcedureService.insertProcedure(id, name);
		return JSON.toJSONString(test);
	}
	
	@GetMapping("/testUpdate/{id}/{name}")
	public String testUpdate(@PathVariable(name="id") String id, @PathVariable(name="name") String name){
		String test = testProcedureService.updateProcedure(id, name);
		return JSON.toJSONString(test);
	}
}
