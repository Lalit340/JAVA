package com.lp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lp.dto.NaukriRegDTO;
import com.lp.service.NaukriRegService;
import com.lp.service.NaukriRegServiceImpl;

@WebServlet("/thirdurl")
public class ThirdServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw = null;
		String name = null, addrs = null, gender = null;
		int age = 0, exp = 0;
		String qlf = null, clz = null;
		String skill = null;
		NaukriRegDTO dto = null;
		NaukriRegService service = null;
		HttpSession ses = null;
		String result = null;

		// general settings
		pw = res.getWriter();
		res.setContentType("text/html");
		// read form data
		skill = req.getParameter("skill");
		exp = Integer.parseInt(req.getParameter("exp"));
        System.out.println(skill);
		// get session object
		ses = req.getSession(false);
		// get session object to cookies value
		name = (String) ses.getAttribute("name");
		addrs = (String) ses.getAttribute("addrs");
		age = (int) ses.getAttribute("age");
		gender = (String) ses.getAttribute("gender");
		qlf= (String) ses.getAttribute("qlfr");
		clz = (String) ses.getAttribute("clzName");
		System.out.println(gender);
		// create dto object
		dto = new NaukriRegDTO();
		dto.setName(name);
		dto.setAddrs(addrs);
		dto.setAge(age);
		dto.setGender(gender);
		dto.setQlfctn(qlf);
		dto.setClgName(clz);
		dto.setSkill(skill);
		dto.setExperiance(exp);
		// create service object
		service = new NaukriRegServiceImpl();
		try {
			result = service.insertPersonInfo(dto);
			pw.println("<h1 style='color:red;text-align:center'>" + result + "</h1>");
		} catch (Exception e) {
			pw.println("<h1 style='color:red;text-align:center'>INTERNAL PROBLEM</h1>");
			e.printStackTrace();
		}

		pw.println("<br><b> Session Id" + ses.getId() + "</b>");
		// add an hyper link
		pw.println("<br><br><a href='Registration.html'>Go to Home</a>");
		pw.close();
	}// doGet(-, -)

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		doGet(req, res);
	}// doPost(-,-)
}//servlet
