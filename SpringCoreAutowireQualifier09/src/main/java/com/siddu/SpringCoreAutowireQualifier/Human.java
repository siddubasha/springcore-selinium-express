package com.siddu.SpringCoreAutowireQualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	@Autowired
	@Qualifier("Octopusheart")
	private Heart heart;
	
	
	
	
	
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("setter method called");
	}
	public Human() {
		
	}
	
	public Human(Heart heart) {
		super();
		this.heart = heart;
		System.out.println("constructor is called");
	}
	
	public void startPumping() {
		if(heart!=null) {
		heart.pump();
		System.out.println("name of the animal is : "+heart.getNameOfAnimal()+" no of heart present "
				+heart.getNoOfHeart());
		}
		else {
			System.out.println("your dead");
		}
	}
}
