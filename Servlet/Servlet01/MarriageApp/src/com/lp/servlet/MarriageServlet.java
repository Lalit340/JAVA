package com.lp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarriageServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {

		PrintWriter pw = null;
		String name = null, gender = null;
		double age = 0;
		// create printwriter obj
		pw = rep.getWriter();
		// set content type
		rep.setContentType("text/html");
		// set parametetr value in variables
		name = req.getParameter("pname");
		gender = req.getParameter("gender");
		age = Integer.parseInt(req.getParameter("page"));

		if(gender.equalsIgnoreCase("M")) {
			if(age>21)
				pw.println("<h1 style='color:brown;text-align:center'>Mr. "+name+" ur Eligible for Marriage</h1>");
			else
				pw.println("<h1 style='color:brown;text-align:center'>Mr. "+name+" ur Not Eligible for Marriage</h1>");
		} else
		if(gender.equalsIgnoreCase("F")){
			if(age<18)
				pw.println(
						"<h1 style='color:blue;text-align:center'>Mrs./Miss " + name + " you not eligible for marriage</h1>");
			else
				pw.println(
						"<h1 style='color:blue;text-align:center'>Mrs./Miss " + name + " you  eligible for marriage</h1>");
			
			//take a hyper link for home page
			pw.println("<br><br><br><br><a href='input.html'><img src='home.jpeg' width='400' height='400'></a>");
			//close pw stream 
			pw.close();
			
		}
	}

}
