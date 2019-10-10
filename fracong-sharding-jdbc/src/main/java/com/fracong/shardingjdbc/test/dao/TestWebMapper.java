package com.fracong.shardingjdbc.test.dao;

import java.util.List;

import com.fracong.shardingjdbc.test.entity.TestWeb;

public interface TestWebMapper {
	public int insert(TestWeb testWeb);

	public List<TestWeb> queryTestWebList(TestWeb page);

	public Integer countTestWebList(TestWeb testWeb);
}
