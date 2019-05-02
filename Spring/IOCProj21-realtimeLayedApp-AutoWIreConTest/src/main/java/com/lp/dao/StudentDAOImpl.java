package com.lp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.lp.bo.StudentBO;

public class StudentDAOImpl implements StudentDao {

	private static final String  INSERT_LAYERED_STUDENT_QUERY="INSERT INTO STUDENT_MARKS VALUES(SNO_STUD.NEXTVAL,?,?,?,?)";
	private DataSource ds;
	


public StudentDAOImpl(DataSource ds) {
		System.out.println("StudentDAOImpl.StudentDAOImpl(1-param Cons)");
		this.ds = ds;
	}



/*	public StudentDAOImpl() {
		System.out.println("StudentDAOImpl::0-param constructor");
	}
	
	//for setter injection
	public void setDs(DataSource ds) {
		System.out.println("StudentDAOImpl.setDs(-)");
		this.ds = ds;
	}
*/

	@Override
	public int insert(StudentBO bo) throws Exception {
		System.out.println("StudentDAOImpl.insert(-)");
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		//get Pooled JDBC con object
		con=ds.getConnection();
		//create PreparedStatement obj
		ps=con.prepareStatement(INSERT_LAYERED_STUDENT_QUERY);
		//set values BO class obj data to Query IN params(?)
	//	ps.setInt(1,bo.getSno());
		ps.setString(1,bo.getSname());
		ps.setInt(2,bo.getTotal());
		ps.setFloat(3,bo.getAvg());
		ps.setString(4,bo.getResult());
		//execute the Query
		result=ps.executeUpdate();
		//close jdbc objs
		ps.close();
		con.close();
		return result;
	}//insert(-)

}//class
