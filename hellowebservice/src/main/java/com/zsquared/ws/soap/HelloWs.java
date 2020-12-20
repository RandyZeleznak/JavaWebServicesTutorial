package com.zsquared.ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.apache.cxf.feature.*;

@WebService
@Features(features="org.apache.cxf.feature.LoggingFeature")
public class HelloWs {
	
	@WebMethod
	public String hello() {
		return "Hello";
	}

}
