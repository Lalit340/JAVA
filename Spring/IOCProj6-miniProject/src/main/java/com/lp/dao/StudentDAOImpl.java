package com.lp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.lp.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
    private static final String INSERT_SPRING_QUERY="INSERT INTO STUDENT_MARK VALUES(?,?,?,?,?)";  
	private DataSource ds;  
	
	public StudentDAOImpl() {
		
	
	}

	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int insert(StudentBO bo) throws Exception {
	       Connection con=null;
	       PreparedStatement ps=null;
	       int result=0;
	       //establish connection
	       con=ds.getConnection();
	       //create preparedstatement obj
	       ps=con.prepareStatement(INSERT_SPRING_QUERY);
	       //PREPARE INSERT VALUES
	       ps.setInt(1, bo.getSno());
	       ps.setString(2, bo.getSname());
	       ps.setDouble(3, bo.getTotal());
	       ps.setDouble(4, bo.getAvg());
	       ps.setString(5, bo.getResult());
	       //execute query
	       result=ps.executeUpdate();
	       
	       //close jdbc objs
	       ps.close();
	       con.close();
	       
		return result;
	}

}
