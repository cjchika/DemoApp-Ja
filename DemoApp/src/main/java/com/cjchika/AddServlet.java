package com.cjchika;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int x = Integer.parseInt(req.getParameter("num1"));
		int y = Integer.parseInt(req.getParameter("num2"));
		
		int z = x + y;
		
		Cookie cookie = new Cookie("z", z+"");
		
//		HttpSession session = req.getSession();
//		session.setAttribute("z", z);
		
		res.addCookie(cookie);
		res.sendRedirect("sqr");
		
//		RequestDispatcher rd = req.getRequestDispatcher("sqr");
//		rd.forward(req, res);
	}
}
