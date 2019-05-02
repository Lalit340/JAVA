package com.lp.target;

public class BankService {
	
	public float calcSimpleInterest(float rate,float time,float pAtm) {
		return (rate*time*pAtm)/100.0f;
	}

}
