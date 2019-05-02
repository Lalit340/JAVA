package com.lp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.InitialContext;
import javax.sql.DataSource;

import com.lp.bo.NaukriRegBO;

public class NaukriRegDAOImpl implements NaukriRegDAO {
	private static final String INSERT_QUERY="INSERT INTO NAUKRI_APP VALUES(NRID_SEQ.NEXTVAL,?,?,?,?,?,?,?,?)";
	
	private Connection   getPooledConnection()  throws Exception {
		InitialContext inc=null;
		DataSource ds=null;
		Connection con=null;
		
		//create initialContext object
		inc=new InitialContext();
		ds=(DataSource) inc.lookup("java:/comp/env/dbjndi");
		con=ds.getConnection();
		return  con;
		
	}

	@Override
	public int naukriRegdsConnection(NaukriRegBO bo) throws Exception {
          Connection con=null;
         PreparedStatement ps=null;
         int count=0;
          //get connection obj
          con=getPooledConnection();
          ps=con.prepareStatement(INSERT_QUERY);
          ps.setString(1, bo.getName());
          ps.setString(2, bo.getAddrs());
          ps.setInt(3, bo.getAge());
          ps.setString(4, bo.getGender());
          ps.setString(5, bo.getQlfctn());
          ps.setString(6, bo.getClgName());
          ps.setString(7, bo.getSkill());
          ps.setInt(8, bo.getExperiance());
          //execute the query
          count=ps.executeUpdate();
          
		return count;
	}

}
