package com.fracong.service.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fracong.util.constant.ConstantUtil;

@Configuration
public class RabbitMQConfig {

	@Bean(name=ConstantUtil.RABBIT_QUEUE_NAME_TEST)
    public Queue xxxQueue(){
		//说明：如果bean的name没有给定，则方法名的xxx必须和ConstantUtil.RABBIT_QUEUE_NAME_TEST的值一致；
		//如果给定name，则name必须为ConstantUtil.RABBIT_QUEUE_NAME_TEST
		return new Queue(ConstantUtil.RABBIT_QUEUE_NAME_TEST);
    }
}
