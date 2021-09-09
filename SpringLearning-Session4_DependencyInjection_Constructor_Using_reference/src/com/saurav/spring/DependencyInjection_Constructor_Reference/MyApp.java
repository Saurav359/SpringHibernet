package com.saurav.spring.DependencyInjection_Constructor_Reference;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("SpringApplicationContext.xml");
		
		CricketCoach coach=context.getBean("cCoach",CricketCoach.class);
		
		System.out.println(coach.getDailyInstruction());
		
		System.out.println(coach.getStudentSubject().getMySubject());
		
		coach = context.getBean( "cCoach1arg",CricketCoach.class);
		
		System.out.println(coach.getDailyInstruction());
		
		context.close();

	}

}
