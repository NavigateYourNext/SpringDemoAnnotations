package com.code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp
{

	public static void main(String[] args) 
	{
		//Load Spring Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Get the Required Beans from Container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		//Call Methods
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		//Close Container
		context.close();
	}

}
