package com.learning.Spring.Annotations;

import org.springframework.stereotype.Component;

@Component("myVerna") // here we have specified the bean id as myVerna, if we done specify any id it will take the default id as myVehicle 
public class MyVehicle implements Vehicle {

	String Model ="Hyundia Verna";
	String Engine = "Double Cylinder Engine";
	
	
	@Override
	public String model() {
		// TODO Auto-generated method stub
		return this.Model;
	}

	@Override
	public String Engine() {
		// TODO Auto-generated method stub
		return this.Engine;
	}

	//1335505684
	
	/*
	 * @Override public String toString() {
	 * 
	 * return "My Vehicle name is : " + this.Model +" With Engine : "+this.Engine; }
	 */
}
