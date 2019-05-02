package com.lp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/watwourl")
public class SecondServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
                     PrintWriter pw=null;
                     double no,cube;
                     //create pw obj
                     pw=res.getWriter();
                     res.setContentType("text/html");
                     //read input value
                     no=Double.parseDouble(req.getParameter("no"));
                     //cube value
                     cube=no*no*no;
                     pw.println("<h1 style='color:blue;text-align:center'>(Cube Value) "+cube+"</h1>");
                     
                     
                     //don't close Stream
	}//doGet()

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}//doPost()
}//class
