package com.lp.dao;

import com.lp.bo.EmployeeBo;
import com.lp.bo.StudentBo;

public interface RegistrationDao {
	
	public void createStudentBo(StudentBo bo);

	public void createEmployeeBo(EmployeeBo bo);
}
