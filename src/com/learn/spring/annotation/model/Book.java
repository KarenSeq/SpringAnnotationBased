package com.learn.spring.annotation.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Book {

	private Novel novel;

	@Autowired
	private Autobiography autobiography;
	
	public Book() {
		System.out.println("In constructor of book..");
	}

	public Novel getNovel() {
		return novel;
	}

	@Autowired
	public void setNovel(Novel novel) {
		this.novel = novel;
	}

	public void checkBookDetails() {
		novel.checkNovelDetails();
	}

	public void checkBookDetails2() {
		autobiography.checkAutobiographyDetails();
	}

}
