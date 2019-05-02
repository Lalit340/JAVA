package com.lp.service;

import com.lp.bo.NaukriRegBO;
import com.lp.dao.NaukriRegDAO;
import com.lp.dao.NaukriRegDAOImpl;
import com.lp.dto.NaukriRegDTO;

public class NaukriRegServiceImpl implements NaukriRegService {

	private NaukriRegDAO dao;

	public NaukriRegServiceImpl() {
		dao = new NaukriRegDAOImpl();
	}

	@Override
	public String insertPersonInfo(NaukriRegDTO dto) throws Exception {
		NaukriRegBO bo = null;
		int result = 0;
		// create bo object
		bo = new NaukriRegBO();
		bo.setName(dto.getName());
		bo.setAddrs(dto.getAddrs());
		bo.setAge(dto.getAge());
		bo.setGender(dto.getGender());
		bo.setQlfctn(dto.getQlfctn());
		bo.setClgName(dto.getClgName());
		bo.setSkill(dto.getQlfctn());
		bo.setExperiance(dto.getExperiance());

		// invoke dao method
		result = dao.naukriRegdsConnection(bo);
		
		if (result != 0)
			return "Registration Succeded";
		else
			return "Registration Failed";
	}//mathod

}//class
