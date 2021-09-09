package com.learning.spring.setter.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyHome implements Home {
	
	@Autowired
	private Parking parking;

	@Override
	public String getWaterSupply() {
		// TODO Auto-generated method stub
		return "Municipal Corporation";
	}

	@Override
	public String getElectricitySupply() {
		// TODO Auto-generated method stub
		return "Electricity Board";
	}

	@Override
	public String getCementSupply() {
		// TODO Auto-generated method stub
		return "Ordered to Wholeseller";
	}

	
	public void setParkingArea(Parking parking)
	{
		this.parking = parking;
	}
	
	@Override
	public String getParkingArea() {
		// TODO Auto-generated method stub
		return parking.getParkingAreaSetup();
	}

}
