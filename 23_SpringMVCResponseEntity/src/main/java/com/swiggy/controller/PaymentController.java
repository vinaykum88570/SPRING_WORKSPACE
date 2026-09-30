package com.swiggy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.swiggy.model.PaymentData;
import com.swiggy.services.PaymentService;

@RestController
public class PaymentController {

	@Autowired
	PaymentService services ;
	
	@PostMapping("/payment/make")
	public ResponseEntity<String> makePayment() {

		String response = services.makePayment();

		if (response.equalsIgnoreCase("Success")) {
			return new ResponseEntity<String>(response, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<String>(response, HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("/track/payment/{paymentId}")
	public ResponseEntity<PaymentData> getPaymentData(@PathVariable String paymentId) {

		System.out.println("Checking Payment Details for Payment Id " + paymentId);

		PaymentData data = services.getPaymentData(paymentId);

		if (data != null) {
			return new ResponseEntity<PaymentData>(data, HttpStatus.OK);
		} else {
			return new ResponseEntity<PaymentData>(data, HttpStatus.NO_CONTENT);
		}

	

		}

	

		// Delete Payment Data

		@DeleteMapping("/delete/payment/{paymentId}")
		public ResponseEntity<String> deletePaymentData(@PathVariable String paymentId) {

			System.out.println("Deleting Payment Details for Payment Id " + paymentId);
			String result = services.deletPaymentData(paymentId);

			if (result != null) {
				return new ResponseEntity<String>(result, HttpStatus.OK);
			} else {
				return new ResponseEntity<String>("No Payment Id Existed : " + paymentId, HttpStatus.NO_CONTENT);
			}
		}

		// Get Details and Status code should be always single value
		@GetMapping("/get/data")
		@ResponseStatus(value = HttpStatus.CONTINUE)
		private String getData() {

			return "proceedd";
		}

		// Get Details and Status code should be always single value
		/*
		 * @GetMapping("/get/data") private ResponseEntity<String> getData() {
		 * 
		 * return new ResponseEntity<String>( "Data is Considered" ,
		 * HttpStatus.ACCEPTED); }
		 */

	}

	

