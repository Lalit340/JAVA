package com.lp.Exceptions;

public class InvaliedAmountException  extends Exception{

	public InvaliedAmountException() {
		System.out.println("InvaliedAmountException.InvaliedAmountException()");
	}

	public InvaliedAmountException(String message) {
		super(message);
	}

}
