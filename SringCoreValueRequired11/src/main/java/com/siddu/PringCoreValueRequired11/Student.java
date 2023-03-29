package com.siddu.PringCoreValueRequired11;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${student.name}")
	private String name;
	@Value("${student.intrestedCourse}")
	private String intrestedCourse;
	@Value("${student.hobby}")
	private String hobby;
	/*
	 * if we put @value annonation there is no need of setter methods.
	 * 
	 */

	public void setName(String name) {
		this.name = name;
	}

	public void setIntrestedCourse(String intrestedCourse) {
		this.intrestedCourse = intrestedCourse;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public void studentInfo() {
		System.out.println("Student name " + name);
		System.out.println("Student intrested course " + intrestedCourse);
		System.out.println("Student hobby " + hobby);
	}

}
