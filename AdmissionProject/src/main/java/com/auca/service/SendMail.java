package com.auca.service;

import java.util.Random;

public class SendMail {

	public SendMail() {
		// TODO Auto-generated constructor stub
		
	}
	public String getRandom() {
		Random rnd = new Random();
		int number=rnd.nextInt(999999);
		return String.format("%06d", number);
		
	}
	public boolean sendEmail(User user) {
		boolean test = false;
		
		
		String fromEmail = malone53@gmail.com;
		String toEmail = user
	}

}
