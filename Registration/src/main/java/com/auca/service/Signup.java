package com.auca.service;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Signup") 
public class Signup extends HttpServlet{
	String email, password;
	private static final long serialVersionUID = 1L;
	
//	public void doGet(HttpServletRequest requ, HttpServletResponse resp){
		
		
//		
//		try {
//			//PrintWriter out = resp.getWriter();
//			
//			if(email!=null && password !=null) {
//				if(email=="wandaguela53@gmail.com" && password =="wanda1@1") {
//					resp.sendRedirect("./home.html");
//				}
//				else {
//					resp.sendRedirect("./frgtPassword.html");
//				}
//			}
//			
//		}catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		
//	}
//	public void doPost(HttpServletRequest req, HttpServletResponse res) {
//		firstName = req.getParameter("firstName");
//		middleName = req.getParameter("MiddleName");
//		lastName = req.getParameter("LastName");
//		gender = req.getParameter("Gender");
//		phoneNumber = req.getParameter("phone Number");
//		city = req.getParameter("city");
//		address = req.getParameter("Address");
//		email = req.getParameter("email");
//		password = req.getParameter("password");
//		retypPassword = req.getParameter("retype Password");
//		
//  try {
//			
//			PrintWriter out = res.getWriter();
//			
//			if(firstName != null && middleName != null && lastName != null && phoneNumber != null && city != null &&address != null && email != null && password != null && retypPassword != null) {
//				res.sendRedirect("/signIn.html");
//				
//				
//
//				}else {
//					out.println("all fields should not be empty");
//				}
//			
//			//out.println("Your userName is "+username+" and Password "+password);
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//  }
  
  public void service(HttpServletRequest req, HttpServletResponse res) {
	    
    try {
    	email = req.getParameter("EmailAddress");
		password = req.getParameter("Password");
    	if(email!=null && password !=null) {
			if(email.equalsIgnoreCase("wandaguela53@gmail.com")&&password.equalsIgnoreCase("wanda1@1")) {
				res.sendRedirect("./home.html");
			}
			else {
				res.sendRedirect("./frgtPassword.html");
			}
		}
	   
	  
  }catch (Exception e) {
	// TODO: handle exception
	  e.printStackTrace();
}
    
  }
}

	

