package com.lp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MarriageServlet extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse rep) throws ServletException, IOException {

		final PrintWriter	pw = rep.getWriter();
		String name = null, gender = null;
	    String tage=null, vflag=null;
		double age = 0;
		List<String> errList=null;
		// set content type
		rep.setContentType("text/html");
		// set parametetr value in variables
		name = req.getParameter("pname");
		gender = req.getParameter("gender");
	//	age = Integer.parseInt(req.getParameter("page"));
        tage=req.getParameter("page");
        vflag=req.getParameter("vflag");
 		if(vflag.equalsIgnoreCase("no")) {
  
 		errList=new ArrayList<>();
        
        if(name==null || name.length()<=0  ||name.equals("")) {
        	errList.add("Name is mandatory ");
        }
        if(tage==null || tage.length()<=0  ||tage.equals("")) {
        	errList.add("Age is mandatory ");
        }else {
        	try {
        		age=Integer.parseInt(tage);
        			if(age<0 || age>125)
        				throw new IllegalArgumentException();
        	}
        	catch (IllegalArgumentException e) {
        		errList.add("Age is mandatory with in  the Range of 1 to 125"); 
			}
       
        }
       if(errList.size()>0) {
        errList.forEach(msg->{
        	pw.print("<h3 style='color:red'><li>"+msg+"</li></h3>");
        });
        return;
       }
 		}else {
 			age=Integer.parseInt(tage);
 		}
 			
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
			else {
				pw.println(
						"<h1 style='color:blue;text-align:center'>Mrs./Miss " + name + " you  eligible for marriage</h1>");
			}
		}
			//take a hyper link for home page
			pw.println("<br><br><br><br><a href='input.html'><img src='home.jpeg' width='40' height='40'></a>");
			//close pw stream 
			pw.close();
			
		
	}

}
