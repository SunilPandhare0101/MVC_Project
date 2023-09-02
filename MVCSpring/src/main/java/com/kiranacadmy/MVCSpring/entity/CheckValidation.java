package com.kiranacadmy.MVCSpring.entity;

import com.kiranacademy.MVCSpring.Variables;

public class CheckValidation {

	public void validation(Variables variable) throws CustomException {
		
		if(variable.getEmail()==null &&variable.getEmail().isEmpty()) {
			
			throw new CustomException(Errormessage.Errormsg, Error.errorcode);
			
		}
		if(variable.getPassword()==null && variable.getPassword().isEmpty()) {
			
			System.out.println("Pass Empty is not allowed");
			throw new CustomException(Errormessage.Errormsg, Error.errorcode);
		}
		
	}
}
