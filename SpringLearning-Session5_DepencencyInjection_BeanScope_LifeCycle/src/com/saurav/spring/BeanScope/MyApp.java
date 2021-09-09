package com.saurav.spring.BeanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("SpringApplicationContext.xml");
		
		CricketCoach coach=context.getBean("cCoach",CricketCoach.class);
		
		System.out.println(coach.getDailyInstruction());
		
		
		CricketCoach coach1 = context.getBean( "cCoach",CricketCoach.class);
		
		System.out.println(coach.getDailyInstruction());
		
		System.out.println(coach1 == coach);
		
		System.out.println(coach1);
		System.out.println(coach);
		
		
		CricketCoach procoach=context.getBean("prototypeCoach",CricketCoach.class);
		
		System.out.println(procoach.getDailyInstruction());
		
		
		CricketCoach procoach1 = context.getBean( "prototypeCoach",CricketCoach.class);
		
		System.out.println(procoach1.getDailyInstruction());
		System.out.println(procoach == procoach1);
		
		System.out.println(procoach);
		System.out.println(procoach1);
		
		context.close();

	}

}
