package com.hm.basicannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	@Bean(name="en")
	public Greeting inEnglish(){
		return new GreetEnglish();
	}
	
	@Bean(name="fr")
	public Greeting inFrench(){
		return new GreetFrench();
	}
}
