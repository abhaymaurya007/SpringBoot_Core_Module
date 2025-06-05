package com.nit.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.nit.Components.ICricketBat;

@Component("cricketer")
public class Cricketer {
	
	@Value("${bat.id}")
	private String name;
	
	
	@Autowired
	@Qualifier("batt") // Specify the bean to avoid ambiguity
	public ICricketBat bat;
	
	public String batting() {
		System.out.println("Cricketer.batting()");
		int runs=bat.scoreRuns();
		return "Cricketer scored "+runs+" runs using ";
		
		
	}
	

}
