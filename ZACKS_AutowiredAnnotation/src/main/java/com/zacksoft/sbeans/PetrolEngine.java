package com.zacksoft.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("petrolEngine")
@Primary
public class PetrolEngine implements Engine {

	@Override
	public void start() {
		System.out.println("Petrol Engine got Started");
	}

}
