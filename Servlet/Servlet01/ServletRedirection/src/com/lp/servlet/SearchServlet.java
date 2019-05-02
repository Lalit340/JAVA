package com.lp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/searchurl")
public class SearchServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
         PrintWriter pw=null;
         String data=null;
         //create printwriter object
         pw=res.getWriter();
         res.setContentType("text/html");
         //read input values
         data=req.getParameter("ss");
         //add hyper link for data pass & search
         pw.println("<h1><a href=https://www.google.com/search?q="+data+"/>GO TO GOOGLE</h1>");
         //close stream
         pw.close();
         
	}//doGet

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		doGet(req, res);
	}//doPost

}//class
