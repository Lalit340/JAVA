package com.lp.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.lp.dto.EmployeeDTO;
import com.lp.service.EmployeeService;
import com.lp.vo.EmployeeVo;

public class MainController {
	private EmployeeService service;

	public MainController(EmployeeService service) {
		System.out.println("MainController.MainController(1-param)");
		this.service = service;
	}
	public List<EmployeeVo> getEmpbyDept(int dept)throws Exception{
		List<EmployeeDTO> listDto=null;
		List<EmployeeVo>    listVo=null;
		EmployeeVo vo=null;
		//call the method for getting empDept
		listDto=service.searchingDept(dept);
		//create collection obj.
		listVo=new ArrayList();
	
		for(EmployeeDTO dto:listDto) {
			vo=new EmployeeVo();
			vo.setEmpno(String.valueOf(dto.getEmpno()));
			vo.setEmpno(dto.getEname());
			vo.setJob(dto.getJob());
			vo.setSalary(String.valueOf(dto.getSalary()));
			vo.setDeptno(String.valueOf(dto.getDeptno()));
			vo.setSno(String.valueOf(dto.getSno()));
			//add to list collection
			listVo.add(vo);
		//	BeanUtils.copyProperties(listDto, vo);
		}
		return listVo;
	}//method

}//class
