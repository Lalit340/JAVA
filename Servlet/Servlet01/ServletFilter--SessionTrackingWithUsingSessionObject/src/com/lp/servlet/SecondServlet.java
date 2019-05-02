package com.lp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/secondurl")
public class SecondServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = null;
		
		String qlfr = null, clz = null;
		HttpSession ses = null;
		// general settings
		pw = res.getWriter();
		res.setContentType("text/html");
		// read form data
		qlfr = req.getParameter("qlf");
		clz = req.getParameter("clz");

		// get session object
		ses = req.getSession(false);
		// set session object to cookies value
		ses.setAttribute("qlfr", qlfr);
		ses.setAttribute("clzName", clz);

		// create second form
		pw.println("<h1 style='color:brown;text-align:center'> Third Dynamic Form </h1>");
		pw.println("<body bgcolor='yellow'>");
		pw.println("<form action='thirdurl' method='post'>");
		pw.println("Skills  ::<select name='skill'>");
		pw.println("<option value='java'>Java</option>");
		pw.println(" <option value='.net'>.net</option>");
		pw.println("<option  value='php'>php</option>");
		pw.println("<option  value='ui'>ui</option>");
		pw.println("</select><br>");
		pw.println(" Experiance::<input type='text' name='exp'><br>");
		pw.println("<input type='submit'  value='Continue'>");
		pw.println("</form>");
		pw.println("</body>");

		// add an hyper link
		pw.println("<br><br><a href='Registration.html'>Go to Home</a>");
		pw.close();
	}// doGet(-, -)

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		doGet(req, res);
	}// doPost(-,-)
}//servlet
