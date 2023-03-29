package com.siddu.SpringCoreAutowireQualifierPractice10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	  @Autowired
	  @Qualifier("heartObject2")
	  private Heart heart;
	  
	 
	 


	public void startPump() {
		if(heart!=null) {
		  heart.pump();
		}
		else {
			System.out.println("object not injected");
		}
	  }


}
