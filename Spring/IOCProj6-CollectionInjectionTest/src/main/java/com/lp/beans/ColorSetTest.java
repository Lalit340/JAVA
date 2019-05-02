package com.lp.beans;

import java.util.Date;
import java.util.Set;

public class ColorSetTest {
	private Set<String> sets;
	private Set<Date>  date;
	public void setSets(Set<String> sets) {
		this.sets = sets;
	}
	public void setDate(Set<Date> date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "ColorSetTest [sets=" + sets + ", date=" + date + "]";
	}

}
