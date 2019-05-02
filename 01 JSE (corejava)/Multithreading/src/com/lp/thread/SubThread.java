package com.lp.thread;

public class SubThread extends Thread {
	public void run() {
		int diff = 0;
		for (int i = 1; i <= 20; i++) {
			diff = diff - i;
			System.out.println(getName() + " Difference ::" + diff);
		}
	}

}