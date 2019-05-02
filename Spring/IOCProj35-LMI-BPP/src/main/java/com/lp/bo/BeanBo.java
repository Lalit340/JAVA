package com.lp.bo;

import java.util.Date;

public abstract class BeanBo {
       private int id;
       private String name;
       private Date doj;
       
       public BeanBo() {
    	   System.out.println("BeanBo.BeanBo()");
       }
       
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Date getDoj() {
		return doj;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	
	
}
