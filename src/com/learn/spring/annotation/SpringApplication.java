package com.learn.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learn.spring.annotation.model.Academics;
import com.learn.spring.annotation.model.Book;

public class SpringApplication {

	public static void main(String[] args) {

		String configLocation = "Beans.xml";

		ApplicationContext context = new ClassPathXmlApplicationContext(configLocation);

		System.out.println("-----------------------Autowiring on Setters--------------------------");
		Book book = (Book) context.getBean("book1");
		book.checkBookDetails();
		System.out.println("----------------------------------------------------------------------\n");
		
		System.out.println("-----------------------Autowiring on Properties--------------------------");
		Book book2 = (Book) context.getBean("book1");
		book2.checkBookDetails2();
		System.out.println("----------------------------------------------------------------------\n");
		
		System.out.println("-----------------------Required--------------------------");
		Academics academics1 = context.getBean("academics1", Academics.class);
		System.out.println(academics1.getTitle());

	}

}
