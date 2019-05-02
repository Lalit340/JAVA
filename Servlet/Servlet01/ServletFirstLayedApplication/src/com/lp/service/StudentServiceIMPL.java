package com.lp.service;

import com.lp.bo.StudentBO;
import com.lp.dao.StudentDAO;
import com.lp.dao.StudentDAOImpl;
import com.lp.dto.StudentDTO;

public class StudentServiceIMPL implements StudentService {

	@Override
	public String generateResult(StudentDTO dto)throws Exception {
		int total = 0;
		float avg = 0;
		String result = null;
		StudentBO bo = null;
		StudentDAO dao = null;
		int cnt = 0;
		// using b.logic for calculating average
		total = dto.getM1() + dto.getM2() + dto.getM3();
		avg = total / 3.0f;
		
		if (avg >= 35)
			result = "pass";
		else
			result = "fail";

		// prepare BO object having parsistance logic
		bo = new StudentBO();
	//	bo.setSid(dto.getSid());
		bo.setSname(dto.getSname());
		bo.setTotal(total);
		bo.setAvg(avg);
		bo.setResult(result);
		
		// create Dao object
		dao=new StudentDAOImpl();
		cnt = dao.insert(bo);
		if (cnt == 0)
			return "Registration Failed";
		else
			return "Registration Success";
	}// generateResult()

}// class
