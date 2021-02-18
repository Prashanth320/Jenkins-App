package com.pr.DI.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pr.DI.Interfaces.Coach;

public class MyCoach {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/pr/DI/cfg/applicationContext.xml");
		Coach c = context.getBean("myCoach", Coach.class);
		System.out.println(c.getDailyWorkout());
		System.out.println(c.getDailyFortune());
		((AbstractApplicationContext) context).close();
	}

}
