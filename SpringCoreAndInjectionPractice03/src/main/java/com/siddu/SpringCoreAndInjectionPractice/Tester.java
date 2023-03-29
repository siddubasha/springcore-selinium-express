package com.siddu.SpringCoreAndInjectionPractice;

public class Tester implements Job{
   private String name;
   private long salary;
   
   public void inFormation() {
	   System.out.println("tester name  :"+name+" salary :"+salary);
   }
   
public void setName(String name) {
	this.name = name;
}
public void setSalary(long salary) {
	this.salary = salary;
}
public void duty() {
	// TODO Auto-generated method stub
	System.out.println("duty is testing : Tester");
}
public void experience() {
	// TODO Auto-generated method stub
	System.out.println(" 8 + years Experience");
}
   
}
