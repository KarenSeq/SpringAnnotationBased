package com.learn.spring.annotation.log.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Log {
	
	private String message;

	public String getMessage() {
		return message;
	}

	//@Autowired
	public void setMessage(String message) {
		this.message = message;
	}
	

}
