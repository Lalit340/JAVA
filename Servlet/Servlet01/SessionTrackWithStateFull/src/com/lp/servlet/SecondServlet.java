package com.lp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sndurl")
public class SecondServlet extends HttpServlet {
	private static final String INSERT_QUERY="INSERT INTO PERSON_INFO VALUES(?,?,?,?,?)";
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=null;
		String name=null;
		String fname=null,ms=null,firstvalue=null,secondvalue=null;
		int count=0;
		Connection con=null;
		PreparedStatement ps=null;
		//create pw object
		pw=res.getWriter();
		res.setContentType("text/html");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//create connection object
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "manager");
			//create  preparestatement object
			ps=con.prepareStatement(INSERT_QUERY);
		    //set param value
			ps.setString(1, name);
			ps.setString(2, fname);
			ps.setString(3, ms);
			ps.setString(4, firstvalue);
			ps.setString(5, secondvalue);
			//execute query
			count=ps.executeUpdate();
			if(count==0) {
				pw.println("<h1 style='color:pink;text-align:center'>Record not Inserted </h1>");
			}else {
				pw.println("<h1 style='color:pink;text-align:center'>Record  Inserted</h1>");
			}
			
		}catch (SQLException se) {
			se.printStackTrace();
		}catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			//close objects
			try {
				if(ps==null)
					ps.close();
			}catch (SQLException se) {
				se.printStackTrace();
			}
			try {
				if(con==null)
					con.close();
			}catch (SQLException se) {
				se.printStackTrace();
			}
		}//finally
		
		
		pw.println("<h1 style='color:brown;text-align:center'>StateLess Session Tracking OutPut </h1> ");
		//read input values
		pw.println("<br> <br><h2 style='color:brown;text-align:center'>First form data ::"+req.getParameter("hname")+" ...... "
				+ "     "+req.getParameter("hfname")+" .... "+req.getParameter("hms")+" </h2>");
		
		pw.println("<h2 style='color:brown;text-align:center'>Second form data ::"+req.getParameter("f1v1")+" ......  "+req.getParameter("f1v2")+"</h2>");
		
		//add hyper link
	     pw.println("<br><br><a href='formData.html'>Go To Home</a>");
	     //close stream
	     pw.close();
	}//doGet(-,-)
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}//doPost(-,-)

}//class
