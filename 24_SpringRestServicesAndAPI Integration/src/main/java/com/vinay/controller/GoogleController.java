package com.vinay.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.vinay.response.PaymentResponse;
import com.vinay.service.GoogleService;

@RestController

public class GoogleController {

	@Autowired
	GoogleService googleService;
	
	//  call REST services
	// http://localhost:9958/SpringMVCResponseEntity/track/payment/paymentID123
	// GET 
	
	
	// Integreting With SpringMVCResponseEntity project
	@GetMapping("/payment")
	public PaymentResponse getPaymentData() {
		System.out.println("In google REST Service");
		PaymentResponse response  = googleService.getPaymentData("payment123456");
		return response;
	}
	
}
