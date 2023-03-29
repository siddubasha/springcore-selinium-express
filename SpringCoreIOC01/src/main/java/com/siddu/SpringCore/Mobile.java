package com.siddu.SpringCore;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Mobile {
   public static void main(String[] args) {
//	  Airtel airtel=new Airtel();
//	  airtel.calling();
//	  airtel.data();
	   
	   
	   ApplicationContext context =new  ClassPathXmlApplicationContext("beans.xml");
	   
	   
	   System.out.println("configued loaded");
	   
	   
	   
//	     Airtel airtel=(Airtel) context.getBean("airtel");
//	     
//	     
//	     airtel.calling();
//	     
//	     airtel.data();
	   
	   
//	           Vodafone voda= context.getBean("voda", Vodafone.class);
//	           
//	           voda.calling();
//	           voda.data();
	   
	         Sim sim= context.getBean("sim", Sim.class);
	         
	         sim.calling();
	         sim.data();
}
}
