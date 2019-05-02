package com.lp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FormServlet extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse rep) 
			                                                                                throws ServletException, IOException {
		PrintWriter pw = null;
		String name = null, gender = null, addrs = null, ms = null, qlfy = null, hb[], crs[];
		int age = 0;
		String msg = null;
		// create or get printwriter obj
		pw = rep.getWriter();
		rep.setContentType("text/html");
		name = req.getParameter("pname");
		gender = req.getParameter("gender");
		addrs = req.getParameter("addr");
		ms = req.getParameter("ms");
		  if(ms==null) {
			  ms="Single";
		  }
		qlfy = req.getParameter("qlfy");
		crs = req.getParameterValues("crs");
		hb = req.getParameterValues("hb");
		age = Integer.parseInt(req.getParameter("page"));

		if (gender.equalsIgnoreCase("M")) {
			if (age < 5)
				msg = "Master. " + name + " u r baby boy";
			else if (age < 12)
				msg = "Master. " + name + " u r boy";
			else if (age < 20)
				msg = "Mr. " + name + " u r teenager boy";
			else if (age < 35)
				msg = "Mr. " + name + " u r young man";
			else if (age < 50)
				msg = "Mr. " + name + " u r middler man";
			else {
				msg = "Mr. " + name + " u r oldman";
			}
		} else {
			if (age < 5)
				msg = "Master. " + name + " u r baby girl";
			else if (age < 12)
				msg = "Master. " + name + " u r girl";
			else if (age < 20) {
				if (ms.equalsIgnoreCase("Married"))
					msg = "Mrs. " + name + " u r young married girl ";
				else
					msg = "Miss " + name + " u r young Unmarried girl ";
			} else if (age < 35) {
				if (ms.equalsIgnoreCase("Married"))
					msg = "Mrs. " + name + " u r Aunty married woman ";
				else
					msg = "Miss " + name + " u r Aunty UNmarried woman ";
			} else if (age < 50) {
				if (ms.equalsIgnoreCase("Married"))
					msg = "Mrs. " + name + " u r old married woman ";
				else
					msg = "Miss " + name + " u r old UNmarried woman ";
			} else {
				if (ms.equalsIgnoreCase("Married"))
					msg = "Mrs. " + name + " u r  very old married woman ";
				else
					msg = "Miss " + name + " u r  very old UNmarried woman ";
			}

		}
 
		// getting form details to dispay
		pw.println("<h1 style='color:gray;text-align:center'>"+msg+"</h1>");
		pw.println("<br><b>Recieved form data</b>");
		pw.println("<br><b> Name ::</b>"+name);
		pw.println("<br><b> Age ::</b>"+age);
		pw.println("<br><b> Gender ::</b>"+gender);
		pw.println("<br><b> Marital Status ::</b>"+ms);
		pw.println("<br><b> Qualification ::</b>"+qlfy);
		pw.println("<br><b>Course ::</b>"+crs);
		pw.println("<br><b> Hobies ::</b>"+hb);
		
		//add one hyper link for home
		pw.println("<br><br><br><b><a href='form.html'>Home</a><b/>");
		//close Stream obj
		pw.close();
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse rep)
			                                                                                 throws ServletException, IOException {
		doGet(req , rep);
	}
}
