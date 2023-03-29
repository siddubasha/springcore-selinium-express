package com.siddu.SpringObjectInjPractice;

public class Bike {
  
	private Petrol petrol;
	private Tyres tyres;
	public Bike(Petrol petrol, Tyres tyres) {
		super();
		this.petrol = petrol;
		this.tyres = tyres;
	}
	
	public void driveBike() {
		System.out.println("-------------BIKE RIDE STARTED--------------");
		petrol.startEngine();
		tyres.moveCar();
	}
}
