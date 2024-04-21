package com.bootcamp.paymentservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

	
	@Autowired
	SimpMessagingTemplate template;
	
	int count = 0;
	
	@GetMapping("/notify")
	public String greet() {
		count = count+1;
		template.convertAndSend("/ordertopic/hello","Payment : "+ count + "success");
		return "Client relod";
	}
	
	
	
}
