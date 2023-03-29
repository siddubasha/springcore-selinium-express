package com.siddu.SpringObjectInjPractice;

public class Car {
   private String key;
   private long driverNumber;
   private Petrol petrol;
   private Tyres tyres;
   
   
   
   public Car(String key, long driverNumber, Petrol petrol, Tyres tyres) {
	super();
	this.key = key;
	this.driverNumber = driverNumber;
	this.petrol = petrol;
	this.tyres = tyres;
}



public void goToDestination() {
	System.out.println(" car key is "+key+" and Driver mobile no: "+driverNumber);
	    petrol.startEngine();
	    tyres.moveCar();
   }
}
