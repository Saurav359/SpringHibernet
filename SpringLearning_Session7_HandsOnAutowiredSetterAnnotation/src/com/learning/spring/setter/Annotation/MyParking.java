package com.learning.spring.setter.Annotation;

import org.springframework.stereotype.Component;

@Component
public class MyParking implements Parking {

	@Override
	public String getParkingAreaSetup() {
		// TODO Auto-generated method stub
		return "Parking Area Plotted : 300sqft";
	}

}
