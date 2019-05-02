package com.lp.service;

import com.lp.bo.StudentBO;
import com.lp.dao.StudentDAO;
import com.lp.dto.StudentDTO;


public class StudentServiceIMPL implements StudentService {
      private StudentDAO dao;
      
	public StudentServiceIMPL() {
		System.out.println("StudentServiceIMPL.StudentServiceIMPL(---)");
	}

	public void setDao(StudentDAO dAo) {
		this.dao = dao;
	}

	@Override
	public String evaluateResult(StudentDTO dto)throws Exception{
		int total=0;
		double Avg=0.0;
		String result=null;
		StudentBO bo=null;
		int count=0;
		
		//calculate the marks
		total=dto.getM1()+dto.getM2()+dto.getM3();
		Avg=total/3.0;
		if(dto.getM1()<35 ||dto.getM2()<35 ||dto.getM3()<35 )
			result="fail";
		else
			result="pass";
		
		bo=new StudentBO();
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setAvg(Avg);
		bo.setResult(result);
		bo.setTotal(total);
		
		count=dao.insert(bo);
		if(count==0) {
			return "Registration failed::"+result;
		}
		else
		return "Registration suceeded::"+result;
	}

}
