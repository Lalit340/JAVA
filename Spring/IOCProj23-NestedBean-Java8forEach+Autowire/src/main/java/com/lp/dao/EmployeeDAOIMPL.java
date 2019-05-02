package com.lp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.lp.bo.EmployeeBO;

public class EmployeeDAOIMPL implements EmployeeDAO{
   private final static String Get_Employee_data_Dept="SELECT EMPNO,ENAME,JOB,SALARY,DEPTNO FROM EMP WHERE DEPTNO=?";
	private DataSource ds;
	 public EmployeeDAOIMPL(DataSource ds) {
			System.out.println("EmployeeDAOIMPL.EmployeeDAOIMPL(1-param)");
			this.ds = ds;
		}
	 
	@Override
	public List<EmployeeBO> FindingDept(int dept) throws Exception {
		Connection con=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		List<EmployeeBO> listbo=null;
		EmployeeBO bo=null;
		
		try {
			//create connection obj.
			con=ds.getConnection();
			//create preparedStatement
			pst=con.prepareStatement(Get_Employee_data_Dept);
			//set Query param value
			pst.setInt(1,dept);
	        //Execute the Sql query
			rs=pst.executeQuery();
			//List object
			listbo=new ArrayList();
			while(rs.next()) {
				bo=new EmployeeBO();
				bo.setEmpno(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setJob(rs.getString(3));
				bo.setSalary(rs.getDouble(4));
				bo.setDeptno(rs.getInt(5));
				//add to list collection
				listbo.add(bo);
			 }
		}
		catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		finally {
			//close jdbc obj.
			try {
				if(rs!=null)
					rs.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(pst!=null)
					pst.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
			try {
				if(con!=null)
					con.close();
			}
			catch(SQLException se) {
				se.printStackTrace();
			}
		}//finally
		return listbo;
	}//method

}//class
