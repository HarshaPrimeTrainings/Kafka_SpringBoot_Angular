package com.bootcamp.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bootcamp.orderservice.dto.OrderDetails;
import com.bootcamp.orderservice.producer.OrderProducer;

@RestController
public class OrderController {

	@Autowired
	OrderProducer prodcure;
	
	@PostMapping("/send")
	public String postMessage(@RequestBody String message) {
		prodcure.sendMessage(message);
		return message+ " publised";
	}
	
	@PostMapping("/save")
	public OrderDetails saveOrder(@RequestBody OrderDetails orders) {
		prodcure.publishOrder(orders);
		return orders;
	}
	
	
}
