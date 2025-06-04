package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("com\\nit\\cfgs\\ApplicationContext.xml")
public class Proj02DesignPatternInBootApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx=	SpringApplication.run(Proj02DesignPatternInBootApplication.class, args);
	    Vehicle vehicle=ctx.getBean("Vehicle",Vehicle.class);
	    vehicle.journey();
	    ctx.close();
	
	}

}
