package com.fracong.service.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fracong.test.dao.TestMapper;
import com.fracong.test.entity.Test;

@Service
public class MyTestService {
	@Autowired
	private TestMapper testMapper;

	public Test test(String id) {
		Test test = testMapper.selectByPrimaryKey(id);
		return test;
	}
}
