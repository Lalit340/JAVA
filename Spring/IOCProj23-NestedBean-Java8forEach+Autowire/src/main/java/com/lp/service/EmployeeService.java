package com.lp.service;

import java.util.List;

import com.lp.dto.EmployeeDTO;

public interface EmployeeService {
	
	public List<EmployeeDTO> searchingDept(int dept)throws Exception;

}
