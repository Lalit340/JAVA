package com.lp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logurl")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = null;
		String user = null, pwd = null;

		// general settings
		pw = res.getWriter();
		res.setContentType("text/html");
		// read form data
		user = req.getParameter("user");
		pwd = req.getParameter("pwd");
		// if condition
		if (user.equalsIgnoreCase("lalit@gmail.com") && pwd.equalsIgnoreCase("prachi")) {
			pw.println("<h1 style='color:brown;text-align:center'>Valid Credential user Login Success</h1>");
		} else
			pw.println("<h1 style='color:brown;text-align:center'>In-Valid Credential user Login Failed</h1>");


		pw.println("<b>Request object of the class ::</b>" + req.getClass());
		pw.println("<b>Response object of the class ::</b>" + req.getClass());

		// add hyper link
		pw.println("<br><br><a href='form.html'>Go to Home</a>");
		// close Stream
		pw.close();

	}// doGet()

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, res);
	}// doPost()

}// class
