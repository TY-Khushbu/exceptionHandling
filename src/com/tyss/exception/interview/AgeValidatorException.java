package com.tyss.exception.interview;

public class AgeValidatorException extends Exception {
	String msg;
	
	public AgeValidatorException(String msg) {
		super(msg);
	}

	@Override
	public String toString() {
		return "AgeValidatorException [msg=" + msg + "]";
	}


}
