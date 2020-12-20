package org.practice.specs;

import org.springframework.stereotype.Component;
import org.practice.interfaces.Engine;


public class V8 implements Engine{
 
	@Override
	public String type()
	{
		return "V8 Engine";
	}
}
