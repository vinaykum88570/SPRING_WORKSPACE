package com.zoo.animal;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("lion")
public class Lion implements Animal{
	@Override
	public void nameOfAnimal() {
		System.out.println("This is lion");
		
	}
}
