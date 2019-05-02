package com.lp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/frturl")
public class FirstServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=null;
		String name=null;
		String fname=null;
		String ms=null;
		//create pw object
		pw=res.getWriter();
		res.setContentType("text/html");
		//read param values
		name=req.getParameter("pname");
		fname=req.getParameter("fname");
		ms=req.getParameter("married");
		//if condition
		if(ms==null)
			ms="single";
		//main if cond
		if(ms.equalsIgnoreCase("married")) {
		     pw.println("<form action='sndurl' method='POST'>")	;
		     pw.println("Spoun Name ::<input type='text'  name='f1v1'><br>");
		     pw.println("How Many Kids ::<input type='text'  name='f1v2'><br>");
		     pw.println("<input type='submit'  value='submit'>");
		     pw.println("</form>")	;
		}else { 
			pw.println("<form action='sndurl' method='POST'>")	;
	     pw.println("When U want to marry ::<input type='text'  name='f1v1'><br>");
	     pw.println("Why U Want to marry::<input type='text'  name='f1v2'><br>");
	     pw.println("<input type='submit'  value='submit'>");
	     pw.println("</form>")	;
			
	   //add hyper link
	     pw.println("<br><br><a href='formData.html'>Go To Home</a>");
	     //close stream
	     pw.close();
	     
		}//else
		
	}//doget(-,-)
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}//dopost(-,-)

}
