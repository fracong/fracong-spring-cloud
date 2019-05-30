package com.fracong.manage.rabbitmq;

import java.util.Date;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import com.fracong.util.constant.ConstantUtil;

@Component
public class RabbitConsumer {
	/**
	 * (如果在方法上添加@RabbitListener，那么在类上的@RabbitListener就可以去除，同时去除@RabbitHandler注解)
	 */
	@RabbitListener(queues=ConstantUtil.RABBIT_QUEUE_NAME_TEST)
    public void onMessage(@Payload String foo){
       System.out.println(" >>>RabbitMQ： "+new Date() + ": " + foo);
    }
}
