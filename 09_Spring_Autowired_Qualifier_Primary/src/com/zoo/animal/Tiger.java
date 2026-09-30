package com.zoo.animal;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("tiger")
@Primary
public class Tiger implements Animal {

	@Override
	public void nameOfAnimal() {
		System.out.println("This is Tiger:");

	}

}
