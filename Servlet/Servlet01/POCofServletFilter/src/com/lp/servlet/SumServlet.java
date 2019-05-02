package com.lp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sumurl")
public class SumServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=null;
		int val1=0,val2=0;
		//general settings
		pw=res.getWriter();
		res.setContentType("text/html");
		//read form data
		val1=Integer.parseInt(req.getParameter("t1"));
		val2=Integer.parseInt(req.getParameter("t2"));
		
		pw.println("<h1 style='color:red;text-align:center'> Sum value ::"+(val1+val2)+"</h1>");
		//add hop hyper link
		pw.println("<br><br><a href='index.html'>Go To Home</a>");
		pw.close();
		
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}

}
