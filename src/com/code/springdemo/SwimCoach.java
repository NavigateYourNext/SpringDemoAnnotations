package com.code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.password}")
	private String password;
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public String getEmail() {
		return "Email Is: "+email;
	}

	public String getPassword() {
		return "Password Is: "+password;
	}

	public SwimCoach(FortuneService fortuneService)
	{
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout()
	{
		
		return "Do practice for 1 hour";
	}

	@Override
	public String getDailyFortune() 
	{
		return fortuneService.getDailyFortune();
	}

}
