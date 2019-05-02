package com.lp.service;

import com.lp.bo.EmployeeBo;
import com.lp.bo.StudentBo;
import com.lp.dao.RegistrationDao;

public abstract class RegistrationServiceImpl implements RegistrationService {
    private RegistrationDao dao; 
	
	public RegistrationServiceImpl(RegistrationDao dao) {
		System.out.println("RegistrationServiceImpl.RegistrationServiceImpl()");
		this.dao = dao;
	}

	public abstract StudentBo getStudentBo(); 
	public abstract EmployeeBo getEmployeeBo(); 
	
	public void insertStudentBo(int id, String name, String course) {
		System.out.println("RegistrationServiceImpl.insertStudentBo()");
		StudentBo bo=getStudentBo();
		bo.setId(id);
        bo.setName(name);
        bo.setCourse(course);
        dao.createStudentBo(bo);
       
	}

	

	public void insertEmployeeBo(int id, String name, String desg) {
	         System.out.println("RegistrationServiceImpl.insertEmployeeBo()");
	         EmployeeBo bo=getEmployeeBo();
	         bo.setId(id);
	         bo.setName(name);
	         bo.setDesg(desg);
	         dao.createEmployeeBo(bo);
	}
	
}
