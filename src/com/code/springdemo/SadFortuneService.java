package com.code.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		
		return "Today, is your lucky day!";
		
	}

}
