package com.lp.beans;

public class TravelAgents {
	private TourPlace tp1;

	public void setTp1(TourPlace tp1) {
		this.tp1 = tp1;
	}
    public void executeAgent() {
    	System.out.println(tp1+"completed to travel all this placeses");
    }
}
