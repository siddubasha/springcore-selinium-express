package com.siddu.SpringObjectInjPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarDriver {
     
	public static void main(String[] args) {
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		
		System.out.println("bean are created");
		
		Car car=context.getBean("car",Car.class);
		
		car.goToDestination();
		
		Bike bike=context.getBean("bike",Bike.class);
		
		bike.driveBike();
	}
}
