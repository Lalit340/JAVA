package com.lp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lp.dto.StudentDTO;
import com.lp.service.StudentService;
import com.lp.vo.StudentVo;

@Component("mainStd")
public class MainController {
	@Autowired
	private StudentService service;

	public String generateResult(StudentVo vo) throws Exception {
		System.out.println("MainController.generateResult(-)");
		StudentDTO dto = null;
		String result = null;
		// Convert StudentVO class obj to StudentDTO class obj
		dto = new StudentDTO();
	//	dto.setSno(Integer.parseInt(vo.getSno()));
		dto.setSname(vo.getSname());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		// use Service
		result = service.evaluateResult(dto);
		return result;
	}

}
