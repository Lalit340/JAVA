package com.lp.Exceptions;


public class InsufientBalanceNotException extends Exception {

	public InsufientBalanceNotException() {
		System.out.println("InsufientBalanceNotException.InsufientBalanceNotException()");
		
	}

	public InsufientBalanceNotException(String message) {
		super(message);
		
	}
	

}