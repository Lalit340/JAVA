package com.lp.beans;

public class ProfessionalCricketer {
	private PersonalBat bat;
	private String nam;
	
	public ProfessionalCricketer(String nam, PersonalBat bat) {
	    System.out.println("ProfessionalCricketer.ProfessionalCricketer()");
		this.nam = nam;
		this.bat = bat;
	}
	public PersonalBat getBat() {
		return bat;
	}
	public void setBat(PersonalBat bat) {
		this.bat = bat;
	}
	public String score() {
		return nam+" scored  "+PersonalBat.run()+" in an innings";
	}

}
