package com.learning.kafkaproject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.kafkaproject.kafka.KafkaJsonproducer;
import com.learning.kafkaproject.payload.User;

@RestController
@RequestMapping("/api/v2/kafka")
public class JsonMessageController {
	KafkaJsonproducer kafkaJsonproducer;
	
	public JsonMessageController(KafkaJsonproducer kafkaJsonproducer) {
		this.kafkaJsonproducer = kafkaJsonproducer;
	}
	@PostMapping("/publish")
	public ResponseEntity<String> publish(@RequestBody User data){
		kafkaJsonproducer.send(data);
		return ResponseEntity.ok("Json message sent to Kafka");
		
		
	}
}
