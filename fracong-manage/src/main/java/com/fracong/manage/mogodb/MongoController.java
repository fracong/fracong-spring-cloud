package com.fracong.manage.mogodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.fracong.manage.mogodb.entity.MongoEntity;
import com.fracong.manage.mogodb.service.MongoService;

@RestController
@RequestMapping("/mongodb")
public class MongoController {
	@Autowired
	private MongoService mongoService;
	
	/**
	 * 调用RestTemplate
	 * @param id
	 * @return
	 */
	@GetMapping("/put")
	public String testMongodbPut(){
		String test = mongoService.inertOne();
		return JSON.toJSONString(test);
	}
	
	/**
	 * 调用RestTemplate
	 * @param id
	 * @return
	 */
	@GetMapping("/get/{id}")
	public String testMongodbGet(@PathVariable(name="id") String id){
		MongoEntity test = mongoService.findById(id);
		return JSON.toJSONString(test);
	}
}
