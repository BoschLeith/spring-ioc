package com.codeup.springioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded");
		Sim tMobile = context.getBean("tMobile", Sim.class);
		tMobile.calling();
		tMobile.data();

	}
}
