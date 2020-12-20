 package org.practice;

import org.practice.cars.Corolla;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.practice")
public class AppConfig {
	
	@Bean("myCorolla")
	public Corolla corolla()
	{
		return new Corolla();
	}

}
