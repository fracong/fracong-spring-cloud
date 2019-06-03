package com.fracong.manage.mogodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fracong.manage.mogodb.entity.MongoEntity;

public interface MongoMapper extends MongoRepository<MongoEntity, String>{
	MongoEntity findByName(String name);
}
