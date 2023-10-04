package com.cjchika;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqrServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
//		int z = Integer.parseInt(req.getParameter("z"));
		
//		HttpSession session = req.getSession();
//		int z = (int)session.getAttribute("z");
		
		int z = 0;
		
		Cookie cookies[] = req.getCookies();
		
		for(Cookie c : cookies) {
			if(c.getName().equals("z")) {
				z = Integer.parseInt(c.getValue());
			}
		}
		
		
		z = z*z;
		
		PrintWriter out = res.getWriter();
		out.println("This is squared!"+z);
		
	}

}
