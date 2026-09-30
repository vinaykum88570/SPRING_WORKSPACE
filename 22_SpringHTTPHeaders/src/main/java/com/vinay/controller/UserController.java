package com.vinay.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@GetMapping("/data")
	public String getApplicationInformation(@RequestHeader(name="security-token",required = false) String tokenValue,
			                                @RequestParam String location) {
		return "This is Flipkart application "+tokenValue +" : from location :"+location;
	}
	

	@GetMapping("/information")
	public ResponseEntity<String> getApplicationData() {

		// Send information to Service
		
		HttpHeaders headers = new HttpHeaders();
		headers.add("token", String.valueOf(Math.random()));
		headers.add("secuirutyType", "JWT");
		
		return new ResponseEntity<String>("This is Flipkart and Running on Dilip System", headers, HttpStatus.OK) ;

	}
	
}
