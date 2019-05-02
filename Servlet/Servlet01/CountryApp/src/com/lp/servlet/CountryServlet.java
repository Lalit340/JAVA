package com.lp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CountryServlet extends HttpServlet {
       public void doPost(HttpServletRequest req, HttpServletResponse rep)
    		                                                                throws ServletException,IOException {
    	   PrintWriter pw=null;
    	   String[] capitals= {"new Delhi" , "Islamabad","Bejing","Melborne"};
    	   int contIndex=0;
    	   //get printWriter obj.
    	   pw=rep.getWriter();
    	   rep.setContentType("text/html");
    	   contIndex=Integer.parseInt(req.getParameter("country"));
    	   //Write Data
    	   pw.println("<h1 style='color:pink';text-align=center'>Capital is "+capitals[contIndex]+"</h1>");
    	   
    	   //take one hyper link
    	   pw.println("<br><br><a href='input.html'><img src='urvashi.jpg' weidth='100' height='100'></a>");
    	   //close Stream
    	   pw.close();
    	   
    	   
       }
}
