package com.fracong.service.config;

import javax.jms.Queue;
import javax.jms.Topic;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fracong.util.constant.ConstantUtil;

@Configuration
public class ActiveMQConfig {

	@Bean
    public Queue queue() {
       return new ActiveMQQueue(ConstantUtil.QUEUE_NAME_TEST);
    }
	
	@Bean
    public Topic topic() {
       return new ActiveMQTopic("sample.topic");
    }
}
