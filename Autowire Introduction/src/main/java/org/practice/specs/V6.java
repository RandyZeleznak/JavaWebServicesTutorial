package org.practice.specs;

import org.springframework.stereotype.Component;	
import org.practice.interfaces.Engine;


public class V6 implements Engine{

	@Override
	public String type()
	{
		return "V6 Engine";
	}
}
