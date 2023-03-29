package com.siddu.SpringObjectInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
//		
//		Student student= new Student();
//		MathCheat cheat= new MathCheat();
//		student.setMathCheat(cheat);
//		student.cheating();
		
		
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		
		System.out.println("beans loaded");
		
		     Student student=context.getBean("student",Student.class);
		     
		     student.cheating();
		     
		    AnotherStudent anotherStudent= context.getBean("anotherStudent",AnotherStudent.class);
		    
		    anotherStudent.startCheat();
	}
}
