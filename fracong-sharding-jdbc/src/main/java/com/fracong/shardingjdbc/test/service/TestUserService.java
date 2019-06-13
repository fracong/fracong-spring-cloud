package com.fracong.shardingjdbc.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fracong.shardingjdbc.test.dao.TestUserMapper;
import com.fracong.shardingjdbc.test.entity.TestUser;
import com.fracong.shardingjdbc.test.entity.TestUserExample;
import com.fracong.shardingjdbc.test.entity.TestUserExample.Criteria;

@Service
public class TestUserService {
	@Autowired
	private TestUserMapper testUserMapper;

	public String insertUser(Integer id, Integer sex, String name) {
		TestUser testUser = new TestUser();
		testUser.setId(id);
		testUser.setSex(sex);
		testUser.setName(name);
		testUserMapper.insert(testUser);
		return "ok";
	}

	public TestUser selectUser(Integer id, Integer sex) {
		TestUserExample example = new TestUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id).andSexEqualTo(sex);
		List<TestUser> list = testUserMapper.selectByExample(example);
		if(!list.isEmpty()) return list.get(0);
		return null;
	}
}
