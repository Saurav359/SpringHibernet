package com.saurav.spring.DependencyInjection.Constructor;

public class CricketCoach implements Coach {

	
	private String dailyInstruction;
	private int luckyNumber;
	private boolean luckyDay;
	
	public CricketCoach() {
	}

	public CricketCoach(int luckyNumber, boolean luckyDay) {
		super();
		this.luckyNumber = luckyNumber;
		this.luckyDay = luckyDay;
	}
	

	public CricketCoach(String dailyInstruction) {
		super();
		this.dailyInstruction = dailyInstruction;
	}


	public CricketCoach(String dailyInstruction,int luckyNumber, boolean luckyDay) {
		super();
		this.dailyInstruction=dailyInstruction;
		this.luckyNumber = luckyNumber;
		this.luckyDay = luckyDay;
	}
	
	
	@Override
	public String getDailyInstruction() {

		return this.dailyInstruction;
	}

	public int getLuckyNumber() {
		return luckyNumber;
	}

	public boolean isLuckyDay() {
		return luckyDay;
	}

}
