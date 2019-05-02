package com.lp.beans;

import java.util.Date;
import java.util.List;

public class CollegeList {
	private List<String> list;
	private List<Date>   dates;
	public void setList(List<String> list) {
		this.list = list;
	}
	public void setDates(List<Date> dates) {
		this.dates = dates;
	}
	@Override
	public String toString() {
		return "CollegeList [list=" + list + ", dates=" + dates + "]";
	}

}
