package com.saurav.spring.BeanScope;

public class CricketCoach implements Coach {

	
	private String dailyInstruction;
	
	
	public CricketCoach() {
		System.out.println("Mirzapur3 : Expectation - Bhai is baar jaldi aaa");
		
		// Added this Print for fun .....enjoy -:) Coding
	}
	
	
	public CricketCoach(String dailyInstruction) {
		
		this.dailyInstruction = dailyInstruction;
	}
	



	@Override
	public String getDailyInstruction() {

		return dailyInstruction;
	}


	
}
