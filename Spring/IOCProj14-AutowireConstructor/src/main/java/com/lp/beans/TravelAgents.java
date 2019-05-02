package com.lp.beans;

import java.util.Calendar;

public class TravelAgents {
	private TourPlace tp;
    private Calendar cal;
    
	public TravelAgents(TourPlace tp) {
		System.out.println("TravelAgents.TravelAgents()");
		this.tp = tp;
	}
	public void setCal(Calendar cal) {
		System.out.println("TravelAgents.setCal()");
		this.cal = cal;
	}
	public void setTp(TourPlace tp) {
		System.out.println("TravelAgents.setTp()");
		this.tp = tp;
	}
    public void executeAgent() {
    	System.out.println(tp+"completed to travel all this placeses on this "+cal+" of the year");
    }
}
