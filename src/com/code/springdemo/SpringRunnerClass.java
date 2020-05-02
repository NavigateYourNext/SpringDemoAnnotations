package com.code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
//@ComponentScan("com.code.springdemo")
public class SpringRunnerClass 
{
	
	//Define bean for sad fortune service
	@Bean
	public FortuneService sadFortuneService()
	{
		return new SadFortuneService();
	}
	
	//Define bean for our swim coach and inject dependencies
	@Bean
	public Coach swimCoach()
	{
		SwimCoach swimCoach = new SwimCoach(sadFortuneService());
		return swimCoach;
	}
	
}
