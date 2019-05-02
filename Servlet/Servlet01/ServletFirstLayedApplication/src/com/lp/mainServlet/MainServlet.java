package com.lp.mainServlet;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lp.dto.StudentDTO;
import com.lp.service.StudentService;
import com.lp.service.StudentServiceIMPL;
import com.lp.vo.StudentVO;

@WebServlet("/studurl")
public class MainServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String sid; 
		String sname = null;
		String m1, m2, m3;
		PrintWriter pw = null;
		StudentVO vo = null;
		StudentDTO dto = null;
		StudentService service = null;
		String result = null;
		
	
		// create PrintWriter Object
		pw = resp.getWriter();
		// set content type
		resp.setContentType("text/html");
		// read the input value
	//	sid=req.getParameter("sid");
		sname = req.getParameter("name");
		m1 = req.getParameter("m1");
		m2 = req.getParameter("m2");
		m3 = req.getParameter("m3");
		// create StudentVo object
		vo = new StudentVO();
	//	vo.setSid(sid);
		vo.setSname(sname);
		vo.setM1(m1);
		vo.setM2(m2);
		vo.setM3(m3);
		// create Dto Object
		dto = new StudentDTO();
		//dto.setSid(Integer.parseInt(vo.getSid()));
		dto.setSname(vo.getSname());
		
		
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		
		try {
		// create service object
		service = new StudentServiceIMPL();
		
			// display the results
		
			
			result = service.generateResult(dto);
			
			pw.println("<h1 style='color:red;text-align:center'>Result :: " + result + "</h1>");
			// add an hyper link
			pw.println("<br><br><a href='Input.html'>Home</a>");
		} // try
		catch (Exception e) {
			pw.println("<h1 style='color:red;text-aling:center'>Internal Problem</h1>");
			// add an hyper link
			pw.println("<br><br><a href='Input.html'>Home</a>");
		} // catch
	
		// close stream connection
		pw.close();
	}// doGet()

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}// doPOst

}// class
