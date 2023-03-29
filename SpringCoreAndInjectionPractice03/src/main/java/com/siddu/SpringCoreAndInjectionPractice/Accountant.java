package com.siddu.SpringCoreAndInjectionPractice;

public class Accountant implements Job {
  private String name;
  private long salary;
  
  
public Accountant(String name, long salary) {
	super();
	this.name = name;
	this.salary = salary;
}

public void duty() {
	// TODO Auto-generated method stub
	System.out.println("duty is accounting : Accountant");
}

public void experience() {
	// TODO Auto-generated method stub
	System.out.println("5 + years Experience");
}
}
