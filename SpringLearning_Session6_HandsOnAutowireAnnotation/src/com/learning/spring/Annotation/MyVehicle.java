package com.learning.spring.Annotation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyVehicle implements Vehicle {
	
	@Autowired
	private Milage milage;
	
	
	MyVehicle(Milage Milage)
	{
		this.milage=milage;
	}
	
	

	@Override
	public void getEngine() {
		System.out.println("Double Cylinder Engine");

	}

	@Override
	public void getModel() {
		System.out.println("Hyundia Verna");

	}

	@Override
	public void getMilage() {
		milage.milage();
		
	}

	
	
	

}
