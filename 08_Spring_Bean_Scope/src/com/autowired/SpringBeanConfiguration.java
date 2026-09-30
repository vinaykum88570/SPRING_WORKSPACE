package com.autowired;

import org.springframework.context.annotation.Bean;

public class SpringBeanConfiguration {

	@Bean("home")
	public Address getHomeAddress() {
		return new Address();
	}
}
