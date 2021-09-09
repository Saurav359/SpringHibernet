package com.saurav.spring.DependencyInjection_Constructor_Reference;

public class CricketCoach implements Coach {

	
	private String dailyInstruction;
	
	
	private StudentSubject studentSubject;
	
	public CricketCoach() {
		System.out.println("Mirzapur3 : Expectation - Bhai is baar jaldi aaa");
		
		// Added this Print for fun .....enjoy -:) Coding
	}
	
	
	public CricketCoach(String dailyInstruction) {
		
		this.dailyInstruction = dailyInstruction;
	}
	
	public CricketCoach(StudentSubject studentSubject, String dailyInstruction) {
		
		this.studentSubject = studentSubject;
		
		this.dailyInstruction = dailyInstruction;
		
		
		System.out.println(studentSubject.getMySubject());
		
			// From Dependency Injection using reference we have initialized StudentSubject
		System.out.println(this.studentSubject.getMySubject() );
		
		// Initialized using bean reference passed by to coach
	}


	@Override
	public String getDailyInstruction() {

		return dailyInstruction;
	}


	
	public Student getStudentSubject() {
		// TODO Auto-generated method stub
		return studentSubject;
	}




	
	
	 //-------Old Example------ 

	/*
	 * public CricketCoach(int luckyNumber, boolean luckyDay) { super();
	 * this.luckyNumber = luckyNumber; this.luckyDay = luckyDay; }
	 * 
	 * 
	 * public CricketCoach(String dailyInstruction) { super(); this.dailyInstruction
	 * = dailyInstruction; }
	 * 
	 * 
	 * public CricketCoach(String dailyInstruction,int luckyNumber, boolean
	 * luckyDay) { super(); this.dailyInstruction=dailyInstruction; this.luckyNumber
	 * = luckyNumber; this.luckyDay = luckyDay; }
	 * 
	 * 
	 * @Override public String getDailyInstruction() {
	 * 
	 * return this.dailyInstruction; }
	 * 
	 * public int getLuckyNumber() { return luckyNumber; }
	 * 
	 * public boolean isLuckyDay() { return luckyDay; }
	 * 
	 * @Override public String getSubjectService() { // TODO Auto-generated method
	 * stub return null; }
	 * 
	 * 
	 * Old Example Ends
	 */
}
