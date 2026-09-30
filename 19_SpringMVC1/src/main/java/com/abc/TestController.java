package com.abc;

import org.springframework.stereotype.Controller; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.ResponseBody; 
 
@Controller 
public class TestController { 
	
	@RequestMapping("/hello") 
	@ResponseBody
	public String helloToall() { 
		  return "hello World."; 
	}
	
	
 @RequestMapping("/welcome") 
 @ResponseBody 
 public String sayHelloToall() { 
  return "Welcome to Spring MVC World."; 
 } 
}
