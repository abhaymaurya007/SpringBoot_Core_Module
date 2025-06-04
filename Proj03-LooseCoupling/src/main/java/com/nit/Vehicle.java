package com.nit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nit.Components.IEngine;

@Component("Vehicle")
public class Vehicle {
	@Value("${engine.id}")
	private String id;
	
	@Autowired
	@Qualifier("motor")
	private IEngine engine;
	
	public void journey() {
		engine.start();
		engine.stop();
	}

}
