package com.lp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/shourl")
public class ShowingCookiesValuesServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = null;
		Cookie cookies[]; 
		// general settings
		pw = res.getWriter();
		res.setContentType("text/html");
        cookies=req.getCookies();
        if(cookies!=null) {
        pw.println("<h1 style='color:red;text-align:center'>Both Cookies Values</h1><br><br>");
        pw.println("<table border='1' align='center'>");
        pw.println("<tr><th>Cookie Name</th><th>cookie value</th><th>Domain name</th></tr>");
        for(Cookie ck:cookies) {
        	pw.println("<tr><td>"+ck.getName()+"</td><td>"+ck.getValue()+"</td><td>"+ck.getDomain()+"</td></tr>");
        }
        pw.println("</table>");
        }else {
        	pw.println("<h1>No Cookies present</h1>");
        }
        
        //close stream obj
        pw.close();
	}//doGet(-,-)

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}//doPost(-,-)

}//class
