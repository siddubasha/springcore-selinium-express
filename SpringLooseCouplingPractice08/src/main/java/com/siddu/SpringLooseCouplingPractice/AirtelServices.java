package com.siddu.SpringLooseCouplingPractice;

public class AirtelServices {
    private Service service;

	public AirtelServices(Service service) {
		super();
		this.service = service;
	}
    
    public void activateServices() {
    	service.service();
    }
}
