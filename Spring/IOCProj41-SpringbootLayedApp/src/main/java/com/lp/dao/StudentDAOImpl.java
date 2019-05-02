package com.lp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lp.bo.StudentBO;

@Repository("stddao")
public class StudentDAOImpl implements StudentDao {

	//SNO_STUD.NEXTVAL
	private static final String  INSERT_LAYERED_STUDENT_QUERY="INSERT INTO STUDENT_MARKS VALUES(SNO_STUD.NEXTVAL,?,?,?,?)";
	@Autowired
	private DataSource ds;


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
		//ps.setInt(1,bo.getSno());
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
