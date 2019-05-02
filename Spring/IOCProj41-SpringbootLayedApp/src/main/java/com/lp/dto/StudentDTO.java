package com.lp.dto;

import java.io.Serializable;

import lombok.Data;
@Data
public class StudentDTO implements Serializable {
	private int sno;
	private String sname;
	private int m1,m2,m3;
	
}
