package com.lp.beans;

public class Car {
	private String engineNo;
	private String model;
	private String color;
	private String numPlate;
	private int sheets;
	private String engType;
	private int engCC;
	private String OwnerName;
	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setNumPlate(String numPlate) {
		this.numPlate = numPlate;
	}
	public void setSheets(int sheets) {
		this.sheets = sheets;
	}
	public void setEngType(String engType) {
		this.engType = engType;
	}
	public void setEngCC(int engCC) {
		this.engCC = engCC;
	}
	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}
	@Override
	public String toString() {
		return "car [engineNo=" + engineNo + ", model=" + model + ", color=" + color + ", numPlate=" + numPlate
				+ ", sheets=" + sheets + ", engType=" + engType + ", engCC=" + engCC + ", OwnerName=" + OwnerName + "]";
	}

}
