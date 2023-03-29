package com.siddu.SpringLiteralInjectionConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
    public static void main(String[] args) {
		
    	
    	
//    	Student student= new Student();
//    	student.setStudentName("siddu");
//    	student.displayStudentInfo();
    	
    	ApplicationContext context=new  ClassPathXmlApplicationContext("beans.xml");
    	
    	Student student=context.getBean("student",Student.class);
    	
    	student.displayStudentInfo();
    	
    	Student s2=context.getBean("s2",Student.class);
    	
    	s2.displayStudentInfo();
    	
    	        Student s3=context.getBean("s3",Student.class);
    	        
    	        s3.displayStudentInfo();
	}
}
