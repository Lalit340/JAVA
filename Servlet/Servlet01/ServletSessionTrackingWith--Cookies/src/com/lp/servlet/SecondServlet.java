package com.lp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/secondurl")
public class SecondServlet extends HttpServlet {
	@Resource(name="dbjndi")
	private DataSource ds;
	private static final String INSERT_PERSON_DATA="INSERT INTO PERSON_DATA VALUES(?,?,?,?)";

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//fields
		PrintWriter pw=null;
		String name=null,fname=null;
		double income=0,tax=0;
		Cookie[] cookies=null;
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		
		//general settings
		pw=res.getWriter();
		res.setContentType("text/html");
		//get Cookies data
		cookies=req.getCookies();
		//reading 1st form/req1 data
		name=cookies[0].getValue();
		fname=cookies[1].getValue();
		//reading 2nd form/req data
		income=Double.parseDouble(req.getParameter("income"));
		tax=Double.parseDouble(req.getParameter("tax"));
		//database command
		try {
			//create connection object
			con=ds.getConnection();
			//create prepareStatement obj.
			ps=con.prepareStatement(INSERT_PERSON_DATA);
			//set value to db
			ps.setString(1, name);
			ps.setString(2, fname);
			ps.setDouble(3, income);
			ps.setDouble(4, tax);
			//process the  sql query
			count=ps.executeUpdate();
			if(count==0)
				pw.println("<h1 style='color:red;text-align:center'> REgistration Failed</h1>");
			else
				pw.println("<h1 style='color:green;text-align:center'> REgistration Succeded</h1>");
			//Showing Data Of Form1 & Form2 data
			pw.println("<h2>first form data"+name+"---------- "+fname+"</h1>");
			pw.println("<h2>Second form data"+income+"---------- "+tax+"</h1>");
			// add Hyper Link
			pw.println("<br><br><a href='input.html'>Go To Home</a>");
			
		}catch (SQLException se) {
			se.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			//close all jdbc object
			try {
				if(ps!=null)
					ps.close();
			}catch (SQLException se) {
			     se.printStackTrace();
			}
			try {
				if(con!=null)
					con.close();
			}catch (SQLException se) {
			     se.printStackTrace();
			}
			try {
				if(pw!=null)
					pw.close();
			}catch (Exception e) {
			     e.printStackTrace();
			}
		}//finally
		
		
	}//doGet(-,-)

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}//doPost(-,-)

}//class
