package com.lp.filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;


@WebFilter("/sumurl")
public class CheckValueFilter extends HttpFilter implements Filter {
       
 
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
		PrintWriter pw=null;
		int val1=0,val2=0;
		//general settings
		pw=res.getWriter();
		res.setContentType("text/html");
		//read form data
		val1=Integer.parseInt(req.getParameter("t1"));
		val2=Integer.parseInt(req.getParameter("t2"));
		//condition for values
		if(val1<=0 ||val2<=0) {
			pw.println("<h1 style='color:red'> Values should be Positive</h1>");
			pw.println("<br><br><a href='index.html'>Go To Home</a>");
			return;
		}else {
			System.out.println("CheckValueFilter.--Before doFilter() ");
			chain.doFilter(req, res);
			System.out.println("CheckValueFilter.--After doFilter() ");
		}
		
		//close Stream
		pw.close();
		
	}

	
}
