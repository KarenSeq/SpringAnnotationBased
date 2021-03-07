package com.learn.spring.annotation.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Academics {
	
	@Autowired(required = true)
	private String title;
	
	public String getTitle() {
		return title;
	}

	//@Required
	public void setTitle(String title) {
		this.title = title;
	}

	

}
