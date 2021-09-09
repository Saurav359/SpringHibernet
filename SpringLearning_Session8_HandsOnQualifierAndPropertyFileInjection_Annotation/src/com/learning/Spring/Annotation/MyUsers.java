package com.learning.Spring.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class MyUsers implements Users {
	
	public MyUsers() {
		// TODO Auto-generated constructor stub
		
		System.out.println("MuUsers Default Constructor");
	}

	@Autowired // Field Injection
	private UserDetails userDetails;
	
	@Value("${user.name}") // getting values from property file /src/property file
	private String UserName ;
	
	@Value("${user.email}")
	private String userEmailId;
	
	
	@Override
	public String userName() {
		// TODO Auto-generated method stub
		return this.UserName;
	}

	@Override
	public String userEmailId() {
		// TODO Auto-generated method stub
		return this.userEmailId;
	}

	@Override
	public String UserAddress() {
		// TODO Auto-generated method stub
		return userDetails.UserAddress();
	}

	@Override
	public String UserPhone() {
		// TODO Auto-generated method stub
		return userDetails.UserPhone();
	}

	@Override
	public String UserAge() {
		// TODO Auto-generated method stub
		return userDetails.UserAge();
	}

}
