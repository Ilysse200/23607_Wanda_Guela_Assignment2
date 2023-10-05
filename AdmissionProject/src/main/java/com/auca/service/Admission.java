package com.auca.service;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/signUp")
public class Admission extends HttpServlet{

	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException {
		  String email, password;

	    try {
	    	email = req.getParameter("EmailAddress");
			password = req.getParameter("Password");
	    	if(email!=null && password !=null) {
				if(email.equalsIgnoreCase("wandaguela53@gmail.com")&&password.equalsIgnoreCase("wanda1@1")) {
					res.sendRedirect(req.getContextPath() + "/admit.html");
				}
				else {
					res.sendRedirect(req.getContextPath() + "/frgtPassword.html");
				}	
			}
	    	else {
	    		res.sendRedirect(req.getContextPath() + "/frgtPassword.html");
	    	}
		   
		  
	  }catch (Exception e) {
		// TODO: handle exception
		  e.printStackTrace();
	}
	    
	  }
	}