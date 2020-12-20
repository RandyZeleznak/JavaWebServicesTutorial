package org.practice.cars;

import org.practice.interfaces.Car;
import org.springframework.stereotype.Component;

@Component("corolla")
public class Corolla implements Car {

	public String specs() {
		return "Sedan from Toyota";
	}

}
