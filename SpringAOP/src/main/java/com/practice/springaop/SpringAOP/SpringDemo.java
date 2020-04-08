package com.practice.springaop.SpringAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDemo {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);

		CustomerService a1 = context.getBean(CustomerService.class);
		a1.show();
	}

}