package com.fracong.manage.mogodb.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fracong.manage.mogodb.entity.MongoEntity;
import com.fracong.manage.mogodb.repository.MongoMapper;

@Service
public class MongoService {

	@Autowired
	private MongoMapper mongoMapper;
	
	public String inertOne(){
		MongoEntity entity = new MongoEntity();
		entity.setId("aaa");
		entity.setName("fracong");
		mongoMapper.save(entity);
		return "ok";
	}
	
	public MongoEntity findByName(String name){
		return mongoMapper.findByName(name);
	}
	
	public MongoEntity findById(String id){
		Optional<MongoEntity> optional = mongoMapper.findById(id);
		MongoEntity mongoEntity = optional.get();
		return mongoEntity;
	}
}
