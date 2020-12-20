package org.practice.cars;

import org.practice.interfaces.Car;
import org.springframework.stereotype.Component;

@Component("swift")
public class Swift implements Car {

	public String specs() {
		return "Hatchback from Suzuki";
	}

}
