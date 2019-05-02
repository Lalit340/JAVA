package com.lp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/firsturl")
public class FirstServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	            PrintWriter pw=null;
	            String name=null,addrs=null,gender=null;
	            int age=0;
	            HttpSession ses=null;
	            //general settings
	            pw=res.getWriter();
	            res.setContentType("text/html");
	            //read form data
	            name=req.getParameter("name");
	            addrs=req.getParameter("addrs");
	            age=Integer.parseInt(req.getParameter("age"));
	            gender=req.getParameter("gender");
	            System.out.println(gender);
		       //create session object
	            ses=req.getSession(true);
	            //set session object to cookies value
	            ses.setAttribute("name", name);
	            ses.setAttribute("addrs", addrs);
	            ses.setAttribute("age", age);
	            ses.setAttribute("gender", gender);
	            //create second form
	            pw.println("<h1 style='color:brown;text-align:center'> Second Dynamic Form </h1>");
	            pw.println("<body bgcolor='cyan'>");
	            pw.println("<form action='secondurl' method='post'>");
	            pw.println("Qualification  ::<input type='radio' name='qlf' value='B-tech'>B-TECH &nbsp;");
	            pw.println("<input type='radio' name='qlf' value='mca'>MCA &nbsp;");        
	            pw.println("<input type='radio' name='qlf' value='bsc'>BSC &nbsp;");
	            pw.println("<input type='radio' name='qlf' value='bca'>BCA &nbsp;");
	            pw.println("<input type='radio' name='qlf' value='msc'>MSC &nbsp; <br>");
	            pw.println(" College Name ::<input type='text' name='clz'><br>");
	            pw.println("<input type='submit'  value='Continue'>");
	            pw.println("</form>");
	            pw.println("</body>");
	            
	            //add an hyper link
	            pw.println("<br><br><a href='Registration.html'>Go to Home</a>");
	            pw.close();
	}//doGet(-, -)

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}//doPost(-,-)

}//sevlet
