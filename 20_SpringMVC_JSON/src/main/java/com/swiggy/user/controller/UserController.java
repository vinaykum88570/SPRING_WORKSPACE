package com.swiggy.user.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.swiggy.user.request.UserRegisteRequest;
import com.swiggy.user.response.UserRegisteResponse;
import com.swiggy.user.service.UserService;


@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;
	
	// JSON To Java 
	@PostMapping("/register")
	public String getUserDetails(@RequestBody UserRegisteRequest request) {
		
		// controller -> service -> 
		// From service receving Result in the form of response.
		String response = userService.registerUserDetails(request);
		
		return "User created successfully. ";
	}
	
	// Single Java Object To JSON
	@GetMapping("/fetch")
	public UserRegisteResponse getUserDetails() {
		
		UserRegisteResponse response = new UserRegisteResponse();
		response.setEmail("@vinaygmail.com");
		response.setMobile("7373737");
		response.setName("vinay");
		response.setPassword("11111");
		
		// java  should be converted to JSON
		return response;
	}
	
	// Multiple Java Object To JSON
	@GetMapping("/fetch/all")
	public List<UserRegisteResponse> getAllUserDetails() {
		
		List<UserRegisteResponse> allUser = new ArrayList<>();
		
		UserRegisteResponse user1 = new UserRegisteResponse();
		user1.setEmail("@vinaygmail.com");
		user1.setMobile("7373737");
		user1.setName("vinay");
		user1.setPassword("11111");
		
		UserRegisteResponse user2 = new UserRegisteResponse();
		user2.setEmail("@kumdalegmail.com");
		user2.setMobile("32323232");
		user2.setName("kumdale");
		user2.setPassword("999999");
		
		allUser.add(user1);
		allUser.add(user2);
		
		// java  should be converted to JSON
		return allUser;
	}
	@RequestMapping("/hello") 
	@ResponseBody
	public String helloToall() { 
		  return "hello World."; 
	}
}
