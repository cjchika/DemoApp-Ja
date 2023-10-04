package com.cjchika;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int x = Integer.parseInt(req.getParameter("num1"));
		int y = Integer.parseInt(req.getParameter("num2"));
		
		int z = x + y;
		
//		PrintWriter out = res.getWriter();
//		out.println("Result: "+z);
		
		req.setAttribute("z", z);
		
		RequestDispatcher rd = req.getRequestDispatcher("sqr");
		rd.forward(req, res);
	}
}
