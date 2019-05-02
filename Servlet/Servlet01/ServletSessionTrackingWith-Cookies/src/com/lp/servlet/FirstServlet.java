package com.lp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/firsturl")
public class FirstServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = null;
		String name = null, fname = null;
		Cookie ck1 = null, ck2 = null;

		// General setting
		pw = res.getWriter();
		// set contentType
		res.setContentType("text/html");
		// red parameter values
		name = req.getParameter("name");
		fname = req.getParameter("fname");
		// create cookies object
		ck1 = new Cookie("name", name);
		ck2 = new Cookie("fname", fname);
		// create second form object
		pw.println("<h1 style='color:brown;text-align:center'>Second Form Data</h1>");
		pw.println("<form action='secondurl' method='POST'>");
		pw.println("Yearly Income ::<input type='text' name='income'><br>");
		pw.println("Yearly Tax ::<input type='text' name='tax'><br>");
		pw.println("<button type='submit'>Submit</button>");
		pw.println("</form>");
		// add Hyper Link
		pw.println("<br><br><a href='input.html'>Go To Home</a>");
		// close stream
		pw.close();
	}//doGet(-,-)

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}//doPost(-,-)

}//class
