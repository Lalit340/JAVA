package com.lp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LinkServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String pval=null;   
            Locale locales[];
		    PrintWriter writer=null;
               //get printwriter object
               writer=resp.getWriter();
               resp.setContentType("text/html");
               locales=Locale.getAvailableLocales();
               pval=req.getParameter("p1");
               // p1 value b.logic for execution
               if(pval.equalsIgnoreCase("link1")) {
            	   //set needed input for locale
            	   for(Locale l:locales) {
            		   writer.println("All Contries ::"+l.getDisplayCountry()+"<br>");
            	   }
               }else
            	   if(pval.equalsIgnoreCase("link2")) {
            		   for(Locale l:locales) {
                		   writer.println("All Languages ::"+l.getDisplayLanguage()+"<br>");
                	   }
            	   }else {
            		   writer.println("Date & time ::"+new Date());
            	   }
               
               //set a hyper link for Home
               writer.println("<br><br><a href='links.html'><img src='images/home.jpeg' width='100' height='100'></a>");
               //close stream obj
               writer.close();
	}//goGet

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doGet(req, resp);
	}//doPost
}
