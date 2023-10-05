package com.auca.service;

public class User {
	String email;
	String code;
	String name;
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	public User(String name,String email,String code) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.code  = code;
		this.email = email;
	}
    public String getName(){
		return name;
    	
    }
    public void setName(String name) {
    	this.name = name;
    	
    }
    public String getEmail(){
    	return email;
    	
    }
    public void setEmail(String email) {
    	this.email = email;
    }
    public void setCode(String code) {
    	this.code = code;
    }
    public String getCode(){
    	return code;
    	
    }
    

}
