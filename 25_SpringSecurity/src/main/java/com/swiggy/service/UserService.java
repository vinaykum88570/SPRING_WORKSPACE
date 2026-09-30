package com.swiggy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swiggy.dto.UserLogin;
import com.swiggy.dto.UserRegister;
import com.swiggy.entity.UserEntity;
import com.swiggy.repository.UserRepository;

@Service
public class UserService {
   
	@Autowired
	UserRepository repository;
	
	
	public String registerUser(UserRegister request) {
		
		UserEntity entity = new UserEntity();
		entity.setEmailId(request.getEmailId());
		entity.setFullName(request.getFullName());
		entity.setContactNumber(request.getContactNumber());
		entity.setPassword(request.getPassword());
		repository.save(entity);
		
		return "User created SuccessFully Please Login now";
	}


	public String loginUser(UserLogin request) {
	   UserEntity entity = repository.findByEmailIdAndPassword(request.getEmailId(),request.getPassword());
	   System.out.println(entity);
	   if(entity != null) {
		return "User Login is SuccessFull, welcome to Home" ;
	   }
	   else {
		   return "Invalid User Login, try again" ;
	   }
  }
}
