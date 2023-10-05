package com.auca.service;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/Sdashboard")
public class Dashboard extends HttpServlet{

	/**
	 * 
	 */
 private static final long serialVersionUID = 1L;
public void doGet(HttpServletRequest req, HttpServletResponse res) {
		
		  try {
			  PrintWriter out = res.getWriter();
			  HttpSession session = req.getSession(true);
			  
			  @SuppressWarnings("deprecation")
			String email = (String)session.getValue("EmailAddress");
			  out.println("The email is " +email);
					
			  
		  }catch (Exception e) {
			// TODO: handle exception
			  e.printStackTrace();
		}
	}

}
