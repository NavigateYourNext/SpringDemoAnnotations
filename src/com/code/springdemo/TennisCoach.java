package com.code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatTennisCoach")
@Component
@Scope("singleton")
public class TennisCoach implements Coach 
{
	//Field Dependency Injection -> Java Reflection Technology used behind
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach()
	{
		System.out.println("Inside TennisCoach Default Constructor");
	}
	
	//Constructor Dependency Injection
	/*@Autowired
	public TennisCoach(FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
	}*/
	
	@Override
	public String getDailyWorkout() 
	{
		return "Practice your back hand and fore hand";
	}

	@Override
	public String getDailyFortune() 
	{
		return fortuneService.getDailyFortune();
	}
	
	//Setter Dependency Injection
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService)
	{
		System.out.println("Inside Fortune Servie Setter");
		this.fortuneService = fortuneService;
	}*/
	
	//Add init method 
	@PostConstruct
	public void doMyStartupStuff()
	{
		System.out.println("Inside Startup Method");
	}
	
	//Add destroy method
	@PreDestroy
	public void doMyCleanupStuff()
	{
		System.out.println("Inside Cleanup Method");
	}

}
