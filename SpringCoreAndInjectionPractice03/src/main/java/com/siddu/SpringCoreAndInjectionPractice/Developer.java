package com.siddu.SpringCoreAndInjectionPractice;

public class Developer implements Job{

	  private String name;
	  private long salary;
	
	  
	  
	public Developer(String name, long salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public void duty() {
		// TODO Auto-generated method stub
		
		System.out.println("duty is developing : Developer");
	}

	public void experience() {
		// TODO Auto-generated method stub
		System.out.println("10 + years experence");
		
	}
    
}
