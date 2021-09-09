package com.saurav.spring.DependencyInjection_Constructor_Reference;

public class StudentSubject implements Student {

	private String mySubject;
	public StudentSubject() {
		// TODO Auto-generated constructor stub
	}
	
	
	public StudentSubject(String mySubject ) {
			this.mySubject = mySubject;
	}
	
	@Override
	public String getMySubject() {
		
		
		
		
		return mySubject;
	}

}
