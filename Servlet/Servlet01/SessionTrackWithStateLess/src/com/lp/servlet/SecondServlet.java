package com.lp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sndurl")
public class SecondServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=null;
		//create pw object
		pw=res.getWriter();
		res.setContentType("text/html");
		
		pw.println("<h1 style='color:brown;text-align:center'>StateLess Session Tracking OutPut </h1> ");
		//read input values
		pw.println("<br> <br><h2 style='color:brown;text-align:center'>First form data ::"+req.getParameter("pname")+" ......  "+req.getParameter("fname")+" .... "+req.getParameter("ms")+" </h2>");
		
		pw.println("<h2 style='color:brown;text-align:center'>Second form data ::"+req.getParameter("f1v1")+" ......  "+req.getParameter("f1v2")+"</h2>");
		//add hyper link
	     pw.println("<br><br><a href='formData.html'>Go To Home</a>");
	     //close stream
	     pw.close();
	     
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}

}
