package com.bootcamp.orderservice.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.bootcamp.orderservice.dto.OrderDetails;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class OrderProducer {
	
	private final KafkaTemplate<String, String> kafkaTemplate;
	
	@Autowired
	ObjectMapper objMapper;
	
	
	public OrderProducer(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendMessage(String message) {
		kafkaTemplate.send("demo-topic",message);	
	}
	
	public void publishOrder(OrderDetails orderdetais) {
		try {
			String orderString = objMapper.writeValueAsString(orderdetais);
			kafkaTemplate.send("demo-topic", orderString);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

}
