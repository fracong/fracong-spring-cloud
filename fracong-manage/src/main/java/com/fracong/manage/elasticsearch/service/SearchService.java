package com.fracong.manage.elasticsearch.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fracong.manage.elasticsearch.entity.SearchTest;
import com.fracong.manage.elasticsearch.repository.SearchRepository;

@Service
public class SearchService {
	@Autowired
	private SearchRepository searchRepository;

	public String testPut(String id, String name, String enName) {
		SearchTest test = new SearchTest();
		test.setId(id);
		test.setName(name);
		test.setEnName(enName);
		searchRepository.save(test);
		return "ok";
	}

	public SearchTest testGet(String id) {
		Optional<SearchTest> optional = searchRepository.findById(id);
		SearchTest test = optional.get();
		return test;
	}
}
