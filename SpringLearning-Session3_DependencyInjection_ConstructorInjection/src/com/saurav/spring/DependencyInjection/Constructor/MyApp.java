package com.saurav.spring.DependencyInjection.Constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("SpringApplicationContext.xml");
		
		CricketCoach coach=context.getBean("cCoach",CricketCoach.class);
		
		System.out.println(coach.getDailyInstruction());
		System.out.println(coach.getLuckyNumber());
		System.out.println(coach.isLuckyDay());
		
		context.close();

	}

}
