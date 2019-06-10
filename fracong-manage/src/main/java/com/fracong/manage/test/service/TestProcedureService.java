package com.fracong.manage.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fracong.test.dao.TestMapper;
import com.fracong.test.entity.Test;

@Service
public class TestProcedureService {
	@Autowired
	private TestMapper testMapper;

	public String insertProcedure(String id, String name) {
		Test test = new Test();
		test.setId(id);
		test.setName(name);
		testMapper.insertProcedure(test);
		return "ok";
	}

	public String updateProcedure(String id, String name) {
		Test test = new Test();
		test.setId(id);
		test.setName(name);
		testMapper.updateProcedureById(test);
		return "ok";
	}
}
