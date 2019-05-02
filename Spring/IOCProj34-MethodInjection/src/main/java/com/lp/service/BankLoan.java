package com.lp.service;

public class BankLoan {
	
	public double calcLoanInterest(double pAtm, double time) {
		System.out.println("BankLoan.calcLoanInterest()");
		return pAtm*time*2.0/100;
	}

}
