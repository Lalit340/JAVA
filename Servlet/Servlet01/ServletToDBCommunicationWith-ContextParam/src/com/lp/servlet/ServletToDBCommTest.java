package com.lp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletToDBCommTest extends HttpServlet {
	private static final String Query_Select_Emp = "SELECT EMPNO,ENAME,JOB,SALARY FROM EMP WHERE EMPNO=?";

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int empno = 0;
		PrintWriter pw = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		ServletContext sc = null;
		String s1 = null;
		String s2 = null;
		String s3 = null;
		String s4 = null;
		// get printWriter object
		pw = resp.getWriter();
		// set content type
		resp.setContentType("text/html");
		// get parameter values
		empno = Integer.parseInt(req.getParameter("eno"));

		// try block for handling exception
		try {
			// get config obj.
			sc = getServletContext();
			// read the config data
			s1 = sc.getInitParameter("driver");
			s2 = sc.getInitParameter("url");
			s3 = sc.getInitParameter("dbuser");
			s4 = sc.getInitParameter("dbpwd");

			// load the driver class
			Class.forName(s1);
			// create connection object
			con = DriverManager.getConnection(s2, s3, s4);
			// create preparestatement obj
			ps = con.prepareStatement(Query_Select_Emp);
			// set the query required value
			ps.setInt(1, empno);
			// process the resultSet object
			rs = ps.executeQuery();
			if (rs.next()) {
				pw.println("<center><table border='1'>");
				pw.println("<tr>");
				pw.println("<td>" + rs.getInt(1) + "</td>");
				pw.println("<td>" + rs.getString(2) + "</td>");
				pw.println("<td>" + rs.getString(3) + "</td>");
				pw.println("<td>" + rs.getInt(4) + "</td>");
				pw.println("</tr>");
				pw.println("</table></center>");
			} else {
				pw.println("<b>RECORD NOT FOUND</b>");
			}

		} // try
		catch (SQLException se) {
			se.printStackTrace();
		} catch (ClassNotFoundException cfn) {
			cfn.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// close jdbc all Object
			// for ResultSet obj.
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
			// for preparedStatement obj.
			try {
				if (rs != null)
					rs.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
			// for Connection obj.
			try {
				if (con != null)
					con.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		} // finally

		// hyper text for reffer
		pw.println("<br><br><a href='Input.html'>Home</a>");
		// close the printWriter connection
		pw.close();

	}// doGet

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
