package com.lp.dao;

import com.lp.bo.EmployeeBo;
import com.lp.bo.StudentBo;

public class RegistrationDaoImpl implements RegistrationDao {

	public RegistrationDaoImpl() {
		System.out.println("RegistrationDaoImpl.RegistrationDaoImpl()");
	}

	public void createStudentBo(StudentBo bo) {
		System.out.println("RegistrationDaoImpl.createStudentBo()");
		 System.out.println(bo.getId()+"  "+bo.getName()+"   "+bo.getCourse()+"   "+bo.getDoj());

	}

	public void createEmployeeBo(EmployeeBo bo) {
		System.out.println("RegistrationDaoImpl.createEmployeeBo()");
		System.out.println(bo.getId()+"     "+bo.getName()+"      "+bo.getDesg()+"      "+bo.getDoj());
	}
  
}
