package com.lp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ccurl")
public class CrossContextServlet extends HttpServlet {
	
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=null;
		double no=0;
		double sqr=0;
		ServletContext sc1=null,sc2=null;
		RequestDispatcher rd=null;
		//get printWiter object
		pw=res.getWriter();
		res.setContentType("text/html");
	    //read input values
		no=Double.parseDouble(req.getParameter("no"));
		
		//logic for find squar
		sqr=no*no;
		pw.println("<h1 style='color:green;text-align:center'>(Squar value) "+sqr+"</h1>");
		
		//create context onj.
		sc1=getServletContext();
		sc2=sc1.getContext("/WebATwoApp");
		rd=sc2.getRequestDispatcher("/watwourl");
		rd.include(req, res);
		
		//add an hyper link 
		pw.println("<br><br><a herf='input.html'><img src='urvashi.jpg' width='200' height='100'></a>");
		//close Stream
		pw.close();
	
	}//doGet()
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}//doPost

}//class
