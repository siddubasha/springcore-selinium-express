package com.siddu.SpringObjectInjPractice;

public class Tyres {
     private String raw;
     
     public Tyres(String raw) {
		super();
		this.raw = raw;
	}

	public void moveCar() {
    	 System.out.println("with help of tyres only car moves");
     }
}
