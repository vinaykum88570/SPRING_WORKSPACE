package com.zacksoft.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("car")
public class Car {

	@Autowired
	@Qualifier()
	Engine eng;
	
	
	
	public void drive() {
		System.out.println("car strated");
		eng.start();
	}
}
