package com.lp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/insurl")
public class InsertTwoCookiesServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=null;
		Cookie ck1=null,ck2=null,ck3=null,ck4=null;
		
		//general settings
		pw=res.getWriter();
		res.setContentType("text/html");
		//create inmemory cookies object
		ck1=new Cookie("Od","Bhubaneswar");
		ck2=new Cookie("Ap", "Amarabati");
		res.addCookie(ck1);
		res.addCookie(ck2);
		//create persistance cookies 
		ck3=new Cookie("TS","Hyderabad");
		ck4=new Cookie("mp", "Indore");
		ck3.setMaxAge(120);
		ck4.setMaxAge(120);
		res.addCookie(ck3);
		res.addCookie(ck4);
		
		pw.println("<h1>Inserted value For Session Tracking</h1>");
		//close stream
		pw.close();
		
	}//doGet(-,-)

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    		doGet(req, res);
	}//doPost(-,-)

}//class
