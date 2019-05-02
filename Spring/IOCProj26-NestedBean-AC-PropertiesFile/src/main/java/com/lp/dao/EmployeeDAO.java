package com.lp.dao;

import java.util.List;

import com.lp.bo.EmployeeBO;

public interface EmployeeDAO {
	
	public List<EmployeeBO> FindingDept(int dept)throws Exception;


}
