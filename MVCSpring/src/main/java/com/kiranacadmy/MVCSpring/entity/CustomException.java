package com.kiranacadmy.MVCSpring.entity;

public class CustomException extends Exception {

	public final String Errormessage;
	public final String Error;
	
	public CustomException(String errormessage, String error) {
		super();
		Errormessage = errormessage;
		Error = error;
	}
	
	
	
}
