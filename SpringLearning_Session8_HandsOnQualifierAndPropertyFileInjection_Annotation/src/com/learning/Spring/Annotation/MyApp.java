package com.learning.Spring.Annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		// get Spring config file
		ClassPathXmlApplicationContext context 
		= new ClassPathXmlApplicationContext("SpringApplicationContext.xml");
		
		// get bean object
		
		Users user = context.getBean("myUsers", Users.class);
		
		System.out.println(user.userEmailId());
		
		System.out.println(user.userName());
		
		System.out.println(user.UserAddress());
		
		System.out.println(user.UserAge());
		
		
		
		System.out.println(user.UserPhone());
		
		context.close();
		
		

	}

}
