package org.practice.cars;

import org.practice.interfaces.Car;
import org.practice.interfaces.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;



public class Corolla implements Car {
	
	@Autowired
	@Qualifier("V8Engine")
	Engine engine;

	
	
	public String specs() {
		String specs = "Sedan from Toyota with engine type = "+engine.type();
		return specs;
	}

}
