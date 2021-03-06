package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarriageServlet extends HttpServlet {
	
	static {
		System.out.println("MarriageServlet.static block");
	}
	public MarriageServlet() {
		System.out.println("MarriageServlet: 0-param construtor");
	}
	
	@Override
	public void init() throws ServletException {
		 System.out.println("MarriageServlet.init()");
	}
	
	
	public void process(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("MarriageServlet:process(-,-)");
		PrintWriter pw=null;
		String name=null,gender=null;
		int age=0;
		//get PrintWriter
		pw=res.getWriter();
		//set response content type
		res.setContentType("text/html");
		//read form data (req param values)
		name=req.getParameter("pname");
		age=Integer.parseInt(req.getParameter("page"));
		gender=req.getParameter("gender");
		//write b.logic or request processing logic
		if(gender.equalsIgnoreCase("M")) {
			 if(age<21)
				 pw.println("<h1 style='color:cyan;text-align:center'>Mr. "+name+" u not eligle for marriage ..Enjoy u r life </h1> ");
			 else
				 pw.println("<h1 style='color:green;text-align:center'>Mr. "+name+" u  eligle for marriage ..But think Thrice </h1> ");
		}
		else {
			 if(age<18)
				 pw.println("<h1 style='color:red;text-align:center'>Miss. "+name+" u not eligle for marriage ..Be Happy and make Others Happy </h1> ");
			 else
				 pw.println("<h1 style='color:green;text-align:center'>Miss. "+name+" u  elgible for marriage ..But think Once </h1> ");
		}
		
		pw.println("<br><a href='index.html'><img src='home.png' width='50' height='50'></a>");
		
		//get access to Servletconfig obj
		 ServletConfig cg=getServletConfig();  
		 pw.println("<br>p1 init param value ::"+cg.getInitParameter("p1"));
		 pw.println("<br>p2 init param value ::"+cg.getInitParameter("p2"));
		//close stream /Commit the response
		pw.close();
	}//doPost(-,-)
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("MarriageServlet.doGet(-,-)");
		  process(req,res);
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("MarriageServlet.doPost(-,-)");
		  process(req,res);
	}

}//class
