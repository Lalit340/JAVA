package com.lp.beans;

public class Mobile {
	private long number;
	private int        imei;
	private String   brand;
	public void setNumber(long number) {
		this.number = number;
	}
	public void setImei(int imei) {
		this.imei = imei;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Mobile [number=" + number + ", imei=" + imei + ", brand=" + brand + "]";
	}

}
