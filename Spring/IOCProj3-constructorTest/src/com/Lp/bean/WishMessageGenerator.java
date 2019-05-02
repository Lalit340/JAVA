package com.Lp.bean;

import java.util.Date;

public class WishMessageGenerator {
	
		private Date date;
	    public WishMessageGenerator(Date date) {
			
			this.date = date;
		}
	    public String SayHello(String user) {
	    	int hour=0;
	    	//getting hour
	    	hour=date.getHours();
	    	if(hour<=12)
	    		return "GDMRNG"+user;
	    	if(hour<=16)
	    		return "AFTNN"+user;
	    	if(hour<=20)
	    		return "GDEVNG"+user;
	    	else
	    		return "GDNIGT"+user;
			
	    }
}
