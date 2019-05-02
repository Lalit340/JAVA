package com.lp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletTest extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=null;
		ServletContext sc=null;
		//get PrintWriter
		pw=resp.getWriter();
		resp.setContentType("text/html");
		//getting context object
		sc=req.getServletContext();
		String pwd=sc.getInitParameter("dbpwd");
		pw.println("<h1 style='color:red;text-align:center'>"+pwd+"</h1>");
		
		// hyper text for reffer
				pw.println("<br><br><a href='Input.html'>Home</a>");
		//close pw stream
		pw.close();
		
	}
}
