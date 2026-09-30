package com.swiggy.user.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.swiggy.user.entity.SwiggyUsers;
import com.swiggy.user.request.UserRegisterRequest;
import com.swiggy.user.response.UserRegisterResponse;
import com.swiggy.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/register")
	public String registerUserDetails(@RequestBody UserRegisterRequest request) {
		// Controller -> Service
		// From Service receiving Result
		String response = userService.registerUserDetails(request);
		return response;
	}

	// Fetch User details By ID
		@GetMapping("/fetch")
		public UserRegisterResponse getUserDetails() {
		 String email = "ram@gmail.com";
		 UserRegisterResponse response = userService.getUserDetails(email);
			return response;
		}
		
		// Loading All Users Details
		@GetMapping("/fetch/all")
		public List<UserRegisterResponse> getAllUserDetails() {
			// Repo to Service to Controller 
			List<UserRegisterResponse> allUser = userService.getAllUserDetails();
			
			return allUser;
		} 

       // Path Variables
		@RequestMapping(value = "/get/{emailID}", method = RequestMethod.GET )
		public UserRegisterResponse getUserByEmailID(@PathVariable("emailID") String email) {
			
			return userService.getUserDetails(email);
		}
		
		
		
		// List of users : city is HYD age is 30
		//http://localhost:8080/SpringMVC_JPA/user/get?city=Hyderabad
		@GetMapping("/get")
		public String  getUserByCity(@RequestParam("city") String city) {
			
			//can you pass to service layer 
			return "Users are from City :"+city+" are : 1000 ";
		}
		
		@GetMapping("/get/city/gender")
		public String  getUserByCityAndGender(
				                     @RequestParam(name="city",required = false) String city,
				                     @RequestParam(name="gender",required = false) String gender ) {
			
			//can you pass to service layer 
			
			return "Users are from City :"+city+" Gender is :"+gender+" are : 1000 ";
		}
		
		
		
		
		
		
		
}

