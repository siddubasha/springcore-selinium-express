package com.siddu.SpringLiteralInjectionConstructor;

public class Student {
	
    private int id;
    private String studentName;
    
    public Student(int id) {
    	this.id=id;
    }
    public Student(int id, String studentName) {
		super();
		this.id = id;
		this.studentName = studentName;
	}


	public void displayStudentInfo() {
    	System.out.println(" student name is "+studentName+" and id is:"+id);
    }
   
}
