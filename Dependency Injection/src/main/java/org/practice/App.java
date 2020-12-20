package org.practice;

import org.practice.cars.Corolla;
import org.practice.cars.Swift;
import org.practice.interfaces.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	

	public static void main(String[] args) {
		Car swift = new Swift();
		Car corolla = new Corolla();
		
		System.out.println(swift.specs());
		System.out.println(corolla.specs());
		
		AnnotationConfigApplicationContext context	= 
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Car myCar = context.getBean("corolla",Car.class);
		System.out.println(myCar.specs());
		Car myCar2 = context.getBean("swift",Car.class);
		System.out.println(myCar2.specs());
		context.close();

	}

}
