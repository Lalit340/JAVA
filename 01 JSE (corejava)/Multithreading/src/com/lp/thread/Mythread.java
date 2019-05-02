package com.lp.thread;

public class Mythread extends Thread {
	public static void main(String[] args) {
		System.out.println("main started");
		AddThread add = new AddThread();
		SubThread sub = new SubThread();
		add.start();
		sub.start();
		System.out.println("main Ended");
	}
}