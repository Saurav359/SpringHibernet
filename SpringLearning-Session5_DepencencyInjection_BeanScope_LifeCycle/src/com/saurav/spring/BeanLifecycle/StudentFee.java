package com.saurav.spring.BeanLifecycle;

public class StudentFee {
	
	private double fee;
	private String feeTenure;
	
	StudentFee(){
		
	}

	public double getFee() {
		return fee;
	}

	StudentFee( double fee,String feeTenure){
		 	this.fee = fee;
		 	this.feeTenure = feeTenure;
	}

	public String getFeeTenure() {
		return feeTenure;
	}
	
	
	public void getInitMethodStuff() {
		System.out.println("Init Method");
	}
	

	
	public void getDestroyMethodStuff() {
		System.out.println("Destroy Method");
	}
	
}
