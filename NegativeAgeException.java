package com.java.exception;

public class NegativeAgeException extends Exception{
String message;

	public NegativeAgeException() {
		
	super();
	this.message="age cannot be less than zero";
	
	
		// TODO Auto-generated constructor stub
	}
	public NegativeAgeException(String message){
		super(message);
		this.message=message;
		
	}
	
	public String getMessage() {
		// TODO Auto-generated method stub
		return message;
		
	}
	
	public void printStackTrace() {
		//System.out.println("Custom stack trace");
		System.out.println("You can log it");
	}

	
}
