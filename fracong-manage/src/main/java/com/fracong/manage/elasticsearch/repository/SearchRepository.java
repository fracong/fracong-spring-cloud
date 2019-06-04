package com.fracong.manage.elasticsearch.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

import com.fracong.manage.elasticsearch.entity.SearchTest;

@Component
public interface SearchRepository extends ElasticsearchRepository<SearchTest,String>{
	
}
