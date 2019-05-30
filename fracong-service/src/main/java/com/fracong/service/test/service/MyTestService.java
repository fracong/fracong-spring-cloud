package com.fracong.service.test.service;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import com.fracong.test.dao.TestMapper;
import com.fracong.test.entity.Test;

@Service
public class MyTestService {
	@Autowired
	private TestMapper testMapper;
	
	@Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

	@Autowired
    private Queue queue;

	public Test test(String id) {
		Test test = testMapper.selectByPrimaryKey(id);
		return test;
	}
	
	/**
	 * 测试activeMQ 生产者
	 * @param id
	 * @return
	 */
	public String testActvieMq(String id) {
		jmsMessagingTemplate.convertAndSend(queue, "hi, fracong's activeMQ! this id is "+id);
		return "ok";
	}
}
