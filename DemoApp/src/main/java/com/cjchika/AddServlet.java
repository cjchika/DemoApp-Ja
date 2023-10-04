package com.cjchika;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) {
		int x = Integer.parseInt(req.getParameter("num1"));
		int y = Integer.parseInt(req.getParameter("num2"));
		
		int z = x + y;
		
		System.out.println("Result: "+z);
	}
}
