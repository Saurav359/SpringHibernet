package com.saurav.spring.DependencyInjection.SetterGetter;

public class BasketBallCoach implements Coach {

	
	private String dailyInstruction;
	
	@Override
	public String getDailyInstruction() {
		
		
		return this.dailyInstruction;
	}

	public void setDailyInstruction(String dailyInstruction) {
		this.dailyInstruction = dailyInstruction;
	}
	
	

}
