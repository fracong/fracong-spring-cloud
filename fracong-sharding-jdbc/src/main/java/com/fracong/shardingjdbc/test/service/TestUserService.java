package com.fracong.shardingjdbc.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fracong.shardingjdbc.test.dao.TestFracongMapper;
import com.fracong.shardingjdbc.test.dao.TestUserMapper;
import com.fracong.shardingjdbc.test.dao.TestWebMapper;
import com.fracong.shardingjdbc.test.entity.TestFracong;
import com.fracong.shardingjdbc.test.entity.TestUser;
import com.fracong.shardingjdbc.test.entity.TestUserExample;
import com.fracong.shardingjdbc.test.entity.TestUserExample.Criteria;
import com.fracong.shardingjdbc.test.entity.TestWeb;

@Service
public class TestUserService {
	@Autowired
	private TestUserMapper testUserMapper;
	@Autowired
	private TestFracongMapper testFracongMapper;
	@Autowired
	private TestWebMapper testWebMapper;

	public String insertUser(Integer id, Integer sex, String name) {
		TestUser testUser = new TestUser();
		testUser.setId(id);
		testUser.setSex(sex);
		testUser.setName(name);
		testUser.setPassword("123456");
		testUserMapper.insert(testUser);
		return "ok";
	}

	public TestUser selectUser(Integer id, String password) {
		TestUserExample example = new TestUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andIdEqualTo(id).andPasswordEqualTo(password);
		List<TestUser> list = testUserMapper.selectByExample(example);
		if(!list.isEmpty()) return list.get(0);
		return null;
	}

	public TestFracong selectFracong(Integer id) {
		TestFracong fracong = testFracongMapper.selectByPrimaryKey(id);
		return fracong;
	}

	public void insertTestWeb(TestWeb testWeb) {
		int insert = testWebMapper.insert(testWeb);
		System.err.println(insert);
	}

	public List<TestWeb> queryTestWebList(TestWeb testWeb) {
		List<TestWeb> list = testWebMapper.queryTestWebList(testWeb);
		return list;
	}

	public Integer countTestWebList(TestWeb testWeb) {
		Integer total = testWebMapper.countTestWebList(testWeb);
		return total;
	}
}
