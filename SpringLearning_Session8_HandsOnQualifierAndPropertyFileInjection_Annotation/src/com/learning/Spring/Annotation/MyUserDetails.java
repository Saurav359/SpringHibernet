package com.learning.Spring.Annotation;

import org.springframework.stereotype.Component;

@Component
public class MyUserDetails implements UserDetails{

	@Override
	public String UserAddress() {
		// TODO Auto-generated method stub
		return "Shastrinagar Giridih";
	}

	@Override
	public String UserPhone() {
		// TODO Auto-generated method stub
		return "1234567890";
	}

	@Override
	public String UserAge() {
		// TODO Auto-generated method stub
		return "29";
	}

}
