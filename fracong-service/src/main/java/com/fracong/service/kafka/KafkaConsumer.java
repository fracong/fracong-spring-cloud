package com.fracong.service.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.fracong.util.constant.ConstantUtil;

@Component
public class KafkaConsumer {
	@KafkaListener(topics = ConstantUtil.FRACONG_KAFKA_TOPIC)
    public void listen(ConsumerRecord<String, String> cr) throws Exception {
		String value = cr.value();
		System.err.println(value);
		System.err.println("消费者---->id---->:"+cr.toString());
    }
}
