package com.siddu.SpringLooseCouplingPractice;

public class JioService {
     private Service service;

	public JioService(Service service) {
		super();
		this.service = service;
	}
     public void activateJioServices() {
    	 service.service();
     }
}
