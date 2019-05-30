package com.fracong.manage.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	/**
	 * 消费者
	 * @param text
	 */
	@JmsListener(destination = "sample.queue")
    public void receiveQueue(String text) {
       System.out.println(text);
    }
}
