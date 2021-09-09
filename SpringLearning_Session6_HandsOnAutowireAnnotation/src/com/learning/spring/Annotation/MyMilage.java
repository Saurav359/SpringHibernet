package com.learning.spring.Annotation;

import org.springframework.stereotype.Component;

@Component
public class MyMilage implements Milage {

	@Override
	public void milage() {
		System.out.println("20kmpl");

	}

}
