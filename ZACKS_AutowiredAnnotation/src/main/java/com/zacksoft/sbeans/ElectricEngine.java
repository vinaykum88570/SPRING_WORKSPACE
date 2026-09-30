package com.zacksoft.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("electricEngine")

public class ElectricEngine implements Engine {

	@Override
	public void start() {
		System.out.println("Electric Engine got Started");	
	}

}
