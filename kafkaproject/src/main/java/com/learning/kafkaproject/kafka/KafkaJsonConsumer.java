package com.learning.kafkaproject.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.learning.kafkaproject.payload.User;

@Service
public class KafkaJsonConsumer {
	
	public static final Logger LOGGER = LoggerFactory.getLogger(KafkaJsonConsumer.class);

	@KafkaListener(topics = "testTopic1" , groupId="myGroup1")
	public void consume(User user) {
		LOGGER.info(String.format("Message Received-> %s", user));	
		
	}
}
