package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.Controller.FetchHospitals;

@SpringBootApplication
public class Proj06FetchHospitalsDataByCityApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Proj06FetchHospitalsDataByCityApplication.class, args);
	    FetchHospitals fetchHospitals = run.getBean("fetchHospitalsController", FetchHospitals.class);
	     fetchHospitals.getHospitalsByCity("Mumbai").forEach(System.out::println);
	   run.close();
	
	}

}
