package com.lp.bo;

public class StudentBO {
	
	   private int sno;
	   private String sname;
	   private double total;
	   private double  Avg;
	   private String result;
	public StudentBO() {
		System.out.println("StudentBO:: 0-param constructor StudentBO()");
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getAvg() {
		return Avg;
	}
	public void setAvg(double avg) {
		Avg = avg;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	   

}
