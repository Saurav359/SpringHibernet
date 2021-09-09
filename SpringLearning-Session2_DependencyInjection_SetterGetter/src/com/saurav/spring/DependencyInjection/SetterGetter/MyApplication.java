package com.saurav.spring.DependencyInjection.SetterGetter;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("SpringApplicationContext.xml");

		BasketBallCoach coach=context.getBean("bbCoach",BasketBallCoach.class);
		
		System.out.println(coach.getDailyInstruction());
		
		context.close();
		
		
	}

}
