package com.lp.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class NaukriRegDTO implements  Serializable{
	private String name;
	private String addrs;
	private int       age;
	private String gender;
	private String qlfctn;
	private String clgName;
	private String skill;
	private int       experiance;

}
