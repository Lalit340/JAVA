//PlainServlet.java
package com.nt.servlet;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class PlainServlet extends HttpServlet
{
	static{
		   System.out.println("PlainServlet::static block");
	}
	public PlainServlet(){
	      System.out.println("PlainServlet::0-param constructor");
	}

	public void init(ServletConfig  cg)throws ServletException{
           System.out.println("PlainServlet::init(ServletConfig cg) method");
	}

	protected void service(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		System.out.println("PlainServlet::service(-,-) method");
		PrintWriter pw=null;
		//set response content type
		//res.setContentType("text/plain");
		//get PrintWriter object
		pw=res.getWriter();
		//write output to the response object
		pw.println("<table border='1' bgcolor='cyan'>");
		pw.println("<tr> <th>Party Name</th><th>Party Symbol</th><th>Party Leader </th> <th>role </th></tr>");
		pw.println("<tr><td> BJP </td> <td> Lotus </td><td>Amit Shah </td><td> president</td></tr>");
		pw.println("<tr><td> BJP </td> <td> Lotus </td><td>Modi </td><td> Every thing</td></tr>");
		pw.println("<tr><td> Congress </td> <td> Hand </td><td>Pappu </td><td>  President</td></tr>");
		pw.println("<tr><td> AAp </td> <td> Jhadu </td><td> Mental kejriwal </td><td>  Every thing</td></tr>");
		pw.println("</table>");
		//close streams
		pw.close();
	}//service(-,-)
}//class
