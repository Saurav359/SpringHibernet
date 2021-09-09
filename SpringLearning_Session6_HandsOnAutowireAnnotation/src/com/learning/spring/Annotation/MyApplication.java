package com.learning.spring.Annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {

	public static void main(String[] args) {

		// Get String config file

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringApplicationContext.xml");

		// get beans

		Vehicle veh = context.getBean("myVehicle", Vehicle.class);

		// call methods

		
		  veh.getEngine();

		 //veh.getMilage();

		  veh.getModel();
		  
		  veh.getMilage();
		 

		context.close();
	}

}
