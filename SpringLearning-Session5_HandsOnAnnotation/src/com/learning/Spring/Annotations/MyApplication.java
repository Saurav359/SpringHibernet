package com.learning.Spring.Annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApplication {

	public static void main(String[] args) {
		
ClassPathXmlApplicationContext context = 
					new ClassPathXmlApplicationContext("SpringApplicationContext.xml");

Vehicle myVeh = context.getBean("myVerna",Vehicle.class );

System.out.println(myVeh.Engine());

System.out.println(myVeh.model());

System.out.println(myVeh.toString());

System.out.println(myVeh.hashCode());

System.out.println(myVeh);

System.out.println(myVeh.getClass().getClassLoader());

System.out.println(myVeh.getClass().getTypeName());

context.close();

	}

}



