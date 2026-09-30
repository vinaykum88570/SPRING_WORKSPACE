package com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingConfig {

	@Bean
	public Greetings greetings() {
		return new Greetings();
	}
}
