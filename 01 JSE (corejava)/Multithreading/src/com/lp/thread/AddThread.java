package com.lp.thread;

public class AddThread extends Thread {
	public void run() {
		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			sum = sum + i;
			System.out.println(getName() + "Summation ::" + sum);
		}
	}

}
