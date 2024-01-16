package com.learning.kafkaproject.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.learning.kafkaproject.payload.User;

@Service
public class KafkaJsonproducer {

	private static final Logger LOGGER = LoggerFactory.getLogger(KafkaJsonproducer.class);
	private KafkaTemplate<String, User> kafkaTemplate;
	public KafkaJsonproducer(KafkaTemplate<String, User> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void send(User user) {
		
		Message<User> message = MessageBuilder
				.withPayload(user)
				.setHeader(KafkaHeaders.TOPIC, "testTopic1")
				.build();
		kafkaTemplate.send(message);
		LOGGER.info(String.format("Message sent-> %s", user.toString()));
		
	}
}
