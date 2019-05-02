package com.lp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/srsurl")
public class SearchRedirectServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
           PrintWriter pw=null;
           String data=null;
           String engine=null;
           String url=null;
           //create pw object
           pw=res.getWriter();
           res.setContentType("text/html");
           //read input value
           data=req.getParameter("ss");
           engine=req.getParameter("engine");
          
           //if condition 
           if(engine.equalsIgnoreCase("bing")) {
        	   url="https://www.bing.com/search?q="+data;
           } else if(engine.equalsIgnoreCase("yahoo")) {
        	   url="https://in.search.yahoo.com/search?p="+data;
           }else {
        	   url="https://www.google.com/search?q="+data;
           }
	
           System.out.println("Before Sending redirection()");
           res.sendRedirect(url);
           System.out.println("After Sending redirection()"); 
           
           //close stream
           pw.close();
           
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}

}
