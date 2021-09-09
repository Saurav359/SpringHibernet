package com.learning.spring.setter.Annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {
	
	public static void main(String[] args) {
		
		
		// get Spring config file
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringApplicationContext.xml");
		
		// get Bean Object
		Home home = context.getBean("myHome", Home.class);
		
		
		// call bean methods
		System.out.println(home.getWaterSupply());
		
		System.out.println(home.getElectricitySupply());
		
		System.out.println(home.getCementSupply());
		
		System.out.println(home.getParkingArea());
		
		context.close();
	}

}
