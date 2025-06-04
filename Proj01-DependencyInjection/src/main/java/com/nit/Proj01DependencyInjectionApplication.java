package com.nit;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Proj01DependencyInjectionApplication {
	
	@Bean
	public LocalDate createDate() {
		  return LocalDate.now();
	}
	
	
	

	public static void main(String[] args) {
        ApplicationContext run = SpringApplication.run(Proj01DependencyInjectionApplication.class, args);
	  SeasonFinder finder=run.getBean("sf",SeasonFinder.class);
	  System.out.println(finder.findSeason());
	 
        
	}

}
