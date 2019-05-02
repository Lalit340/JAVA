package com.lp.Controller;

import com.lp.dto.StudentDTO;
import com.lp.service.StudentService;
import com.lp.vo.StudentVo;

public class MainController {
private StudentService service;
	
public MainController(StudentService service) {
	System.out.println("MainController.MainController(1-param Cons)");
	this.service = service;
}

/*	public MainController() {
		System.out.println("MainController.MainController()");
	}

	public void setService(StudentService service) {
		System.out.println("MainController.setService(-)");
		this.service = service;
	}*/
	
	public  String generateResult(StudentVo vo)throws Exception{
		System.out.println("MainController.generateResult(-)");
		 StudentDTO dto=null;
		 String result=null;
		//Convert StudentVO class obj to StudentDTO class obj
		 dto=new StudentDTO();
		// dto.setSno(Integer.parseInt(vo.getSno()));
		 dto.setSname(vo.getSname());
		 dto.setM1(Integer.parseInt(vo.getM1()));
		 dto.setM2(Integer.parseInt(vo.getM2()));
		 dto.setM3(Integer.parseInt(vo.getM3()));
		 //use Service
		 result=service.evaluateResult(dto);
		 return result;
	}
	

}
