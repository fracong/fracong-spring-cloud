package com.fracong.manage.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.fracong.util.constant.ConstantUtil;

@Component
public class Consumer {

	/**
	 * 消费者
	 * @param text
	 */
	@JmsListener(destination = ConstantUtil.QUEUE_NAME_TEST)
    public void receiveQueue(String text) {
       System.out.println(text);
    }
}
