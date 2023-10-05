package com.auca.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Registration")
public class Register extends HttpServlet{

	private static final long serialVersionUID = 1L;
	String firstName, middleName, lastName, gender, phoneNumber,city, address, email, password, retypPassword;
	
public void doGet(HttpServletRequest req, HttpServletResponse res) {
		firstName = req.getParameter("firstName");
		middleName = req.getParameter("MiddleName");
		lastName = req.getParameter("LastName");
		gender = req.getParameter("Gender");
		phoneNumber = req.getParameter("phone Number");
		city = req.getParameter("city");
		address = req.getParameter("Address");
		email = req.getParameter("email");
		password = req.getParameter("password");
		retypPassword = req.getParameter("retype Password");
		
  try {
			
			PrintWriter out = res.getWriter();
			
			if(firstName != null && middleName != null && lastName != null && phoneNumber != null && city != null &&address != null && email != null && password != null && retypPassword != null) {
				res.sendRedirect(req.getContextPath() + "/index.html");
				
				

				}else {
					out.println("all fields should not be empty");
				}
			
			//out.println("Your userName is "+username+" and Password "+password);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  }
	
}
	
