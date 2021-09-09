package com.saurav.spring.BeanLifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MyBeanLifeCycleApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("SpringApplicationContext.xml");
		
		StudentFee coach=context.getBean("student",StudentFee.class);
		
		
		
		
		StudentFee coach1 = context.getBean( "prototypeStudent",StudentFee.class);
		
	
		
		
		
		
		System.out.println(coach.getFee());
		System.out.println(coach.getFeeTenure());
		System.out.println(coach1.getFee());
		System.out.println(coach1.getFeeTenure());
		
		
		
		
		context.close();


	}

}
