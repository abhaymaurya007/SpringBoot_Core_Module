package com.nit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.nit.Components.IEngine;

@Component("Vehicle")
public class Vehicle {
	@Autowired
	@Qualifier("dEngine")
	private IEngine engine;
	
	public void journey() {
		engine.start();
		engine.stop();
	}

}
