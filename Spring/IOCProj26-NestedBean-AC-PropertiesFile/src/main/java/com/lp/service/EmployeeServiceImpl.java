package com.lp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.lp.bo.EmployeeBO;
import com.lp.dao.EmployeeDAO;
import com.lp.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDAO dao;

	public EmployeeServiceImpl(EmployeeDAO dao) {
		System.out.println("EmployeeServiceImpl.EmployeeServiceImpl(1-param)");
		this.dao = dao;
	}

	@Override
	public List<EmployeeDTO> searchingDept(int dept) throws Exception {
		List<EmployeeBO> listbo = null;
		List<EmployeeDTO> listdto = null;
		EmployeeDTO dto = null;
		// get listbo values
		listbo = dao.FindingDept(dept);
		// create array obj.
		listdto = new ArrayList();
		for (EmployeeBO bo : listbo) {
			dto = new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);
			dto.setSno(listdto.size()+1);
			// add to list collection
			listdto.add(dto);
		}
		return listdto;
	}// method

}// class
