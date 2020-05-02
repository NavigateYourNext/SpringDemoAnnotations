package com.code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp
{

	public static void main(String[] args) 
	{
		//Load Spring Container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringRunnerClass.class);
		//Get the Required Beans from Container
		SwimCoach theCoach = context.getBean("swimCoach",SwimCoach.class);
		//Call Methods
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getPassword());
		//Close Container
		context.close();
	}

}
