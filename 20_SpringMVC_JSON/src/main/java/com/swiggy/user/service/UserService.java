package com.swiggy.user.service;

import org.springframework.stereotype.Service;

import com.swiggy.user.request.UserRegisteRequest;

// Componant Class 
@Service
public class UserService {

	public String registerUserDetails(UserRegisteRequest request) {
		//Receving Data from Controller
		// transferring data from repository
		// Repo -> DB
		System.out.println(request.getEmail());
		System.out.println(request.getMobile());
		System.out.println(request.getName());
		System.out.println(request.getPassword());
		
		return "User Registered Successfully";
	}
}
