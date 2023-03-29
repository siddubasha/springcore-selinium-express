package com.siddu.SpringLooseCouplingPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
  public static void main(String[] args) {
	
	  ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
	  
	  
	  
	 AirtelServices airtel= context.getBean("airtel",AirtelServices.class);
			 
	 airtel.activateServices();
			  
	 
	 System.out.println("jio services started ------------");
	 
	 
	 
	JioService jio= context.getBean("jio",JioService.class);
	
	jio.activateJioServices();
}
}
