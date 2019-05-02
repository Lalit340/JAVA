package com.lp.beans;

import java.util.Calendar;

public class JuniorCollege {
	private Student st;
	private Calendar cal;
	
    public JuniorCollege() {
    	System.out.println("JuniorCollege.JuniorCollege(0-param cons)");
    }
    
    public JuniorCollege( Student st) {
    	System.out.println("JuniorCollege.JuniorCollege(1-param cons)");
    	this.st=st;
    }

	public void setCal(Calendar cal) {
		this.cal = cal;
	}
	public void setSt(Student st) {
		this.st = st;
	}
	public void executeLogic() {
		System.out.println(st+" this many peaple are joined in this "+cal+" in the stream ");
	}

}
