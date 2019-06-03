package com.fracong.service.test.service;

import javax.jms.Queue;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.fracong.test.dao.TestMapper;
import com.fracong.test.entity.Test;
import com.fracong.util.cache.redis.RedisCacheType;
import com.fracong.util.cache.redis.RedisUtil;
import com.fracong.util.constant.ConstantUtil;

@Service
public class MyTestService {
	@Autowired
	private TestMapper testMapper;
	
	@Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

	@Autowired
    private Queue queue;
	
	@Autowired
	private JavaMailSender mailSender;
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Autowired
	private RedisUtil redisUtil;

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

	/**
	 * 发送邮件
	 * @param id
	 * @return
	 */
	public String sendMail(String id) {
		SimpleMailMessage message = new SimpleMailMessage();
		String fromName = environment.getProperty(ConstantUtil.TEST_MAIL_USERNAME);
		message.setFrom(fromName);//发送者
		String snedName = environment.getProperty(ConstantUtil.TEST_MAIL_SENDNAME);
		message.setTo(snedName);//接收者
		message.setSubject("测试邮件");//邮件主题
		message.setText("这是邮件ID---->"+id);//邮件内容
		mailSender.send(message);//发送邮件
		return "ok";
	}
	
	/**
	 * 测试RabbitMQ 生产者
	 * @param id
	 * @return
	 */
	public String testRabbitMQ(String id) {
		rabbitTemplate.convertAndSend(ConstantUtil.RABBIT_QUEUE_NAME_TEST, "hello, fracong's rabbit! id is "+id);
		return "ok";
	}
	
	/**
	 * 测试Redis put
	 * @param id
	 * @return
	 */
	public String testRedisPut(String id) {
		redisUtil.set(RedisCacheType.TEST.toString(), id, 0);
		return "ok";
	}
	
	/**
	 * 测试Redis get
	 * @param id
	 * @return
	 */
	public String testRedisGet(String id) {
		String string = redisUtil.get(RedisCacheType.TEST.toString(), 0);
		return string;
	}
}
