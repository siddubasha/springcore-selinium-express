package com.siddu.SpringCoreAndInjectionPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Company {
     public static void main(String[] args) {
		
    	  ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
    	  
    	  Tester job=context.getBean("jobT",Tester.class);
    	  
    	  job.duty();
    	  job.experience();
    	  job.inFormation();
    	  
	}
}
