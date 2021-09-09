package com.saurav.spring.chapter1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("SpringApplicationContext.xml");
		
		
		
		Coach bowlingCoach = context.getBean("bCoach", Coach.class);
		
		System.out.println(bowlingCoach.getDailyInstruction());
		
		context.close();
	}

}
