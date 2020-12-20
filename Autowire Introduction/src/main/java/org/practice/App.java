	package org.practice;

import org.practice.cars.Corolla;
import org.practice.cars.Swift;
import org.practice.interfaces.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	

	public static void main(String[] args) {
		
		
		//System.out.println(swift.specs());
		//System.out.println(corolla.specs());
		
		AnnotationConfigApplicationContext context	= 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car myCar = context.getBean("myCorolla",Car.class);
		System.out.println(myCar.specs());
		context.close();

	}

}
