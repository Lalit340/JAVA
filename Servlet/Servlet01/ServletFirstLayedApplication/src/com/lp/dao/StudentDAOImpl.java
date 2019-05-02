package com.lp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.lp.bo.StudentBO;

public class StudentDAOImpl implements StudentDAO {
	//SID_STUD.NEXTVAL
	private static final String INSERT_STUDENT_QUERY="INSERT INTO LAYED_STUDENT VALUES(SID_STUD.NEXTVAL,?,?,?,?)";

	@Override
	public int insert(StudentBO bo)throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;

			//load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//create connection object
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "manager");
			//create prepare Statement obj
			ps=con.prepareStatement(INSERT_STUDENT_QUERY);
			//set values
		//	ps.setInt(1, bo.getSid());
			ps.setString(1, bo.getSname());
			ps.setInt(2, bo.getTotal());
			ps.setFloat(3, bo.getAvg());
			ps.setString(4, bo.getResult());
			count=ps.executeUpdate();
			

		return count;
	}//insert

}//class
