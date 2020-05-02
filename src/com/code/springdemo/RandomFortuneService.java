package com.code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//Create am array of strings
	private String[] data = {
		"Beware of dogs",
		"The journey is the reward",
		"Diligence is the mother of good luck"
	};
	
	//create a radnom number generator
	private Random myRandom = new Random();
	
	
	@Override
	public String getDailyFortune() 
	{
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}
