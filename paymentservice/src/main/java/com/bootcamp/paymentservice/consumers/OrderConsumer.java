package com.bootcamp.paymentservice.consumers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.bootcamp.paymentservice.OrderDetails;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class OrderConsumer {
	
	@Autowired
	ObjectMapper objMapper;
	
	
	@KafkaListener(topics = "demo-topic",groupId = "spring-consumer")
	public void consumeOrder(String message) {
		try {
			OrderDetails order = objMapper.readValue(message, OrderDetails.class);
			System.out.println("Order Placed :" + order);	
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

}
