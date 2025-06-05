package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nit.Service.Cricketer;

@SpringBootApplication
@ImportResource("com\\nit\\cfgs\\application.xml")
public class Proj04AmbiguityProblemApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Proj04AmbiguityProblemApplication.class, args);
		
		Cricketer player = run.getBean("cricketer", Cricketer.class);
		System.out.println(player.batting());
		run.close();
	}

}
