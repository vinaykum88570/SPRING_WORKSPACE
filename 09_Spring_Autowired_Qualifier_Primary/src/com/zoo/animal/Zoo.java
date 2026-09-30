package com.zoo.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Zoo {

    public Zoo() {
	System.out.println("This is zoo");
    }
    
    @Qualifier("lion")
    @Autowired
    Animal animal;

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
    
    
    
	/* @Autowired
	private Tiger tiger;
	@Autowired
	private Lion lion;
	
	public Lion getLion() {
		return lion;
	}
    public void setLion(Lion lion) {
		this.lion = lion;
	}
    public Tiger getTiger() {
		return tiger;
	}
    public void setTiger(Tiger tiger) {
		this.tiger = tiger;
	} */

	
	
	
}
