package com.swiggy.user.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swiggy.user.entity.SwiggyUsers;
import com.swiggy.user.repository.UserRepository;
import com.swiggy.user.request.UserRegisterRequest;
import com.swiggy.user.response.UserRegisterResponse;

// Componant Class 
@Service
public class UserService {

	@Autowired
	UserRepository repository;

	public String registerUserDetails(UserRegisterRequest registerRequest) {

		// Transferring data to Repository

		SwiggyUsers user = new SwiggyUsers();
		user.setEmail(registerRequest.getEmail());
		user.setMobile(registerRequest.getMobile());
		user.setName(registerRequest.getName());
		user.setPassword(registerRequest.getPassword());

		repository.save(user);

		return "User Registered Successfully";

	}

	public UserRegisterResponse  getUserDetails(String email) {
		SwiggyUsers user = repository.findById(email).get();
		UserRegisterResponse response = new UserRegisterResponse();
		response.setEmail(user.getEmail());
		response.setMobile(user.getMobile());
		response.setName(user.getName());
		
		return response;
	}

	public List<UserRegisterResponse> getAllUserDetails() {
		List<SwiggyUsers> allUsers = repository.findAll();
		List<UserRegisterResponse> users = new ArrayList<>();
		
		for (SwiggyUsers user : allUsers) {
			UserRegisterResponse response = new UserRegisterResponse();
			response.setEmail(user.getEmail());
			response.setMobile(user.getMobile());
			response.setName(user.getName());
			users.add(response);
		}
		return users;
		
	}
}
