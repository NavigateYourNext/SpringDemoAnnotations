package com.code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class RestFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() 
	{
		return "Today, is your lucky day!";
	}

}