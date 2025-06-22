package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.Controller.PayrollOperationControler;

@SpringBootApplication
public class Proj05JdbcFetchDataApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Proj05JdbcFetchDataApplication.class, args);
	
	       PayrollOperationControler controller = run.getBean("payrollController", PayrollOperationControler.class);
	       try {
			controller.showEmployeesByDesgs("SDE", "sdel", "SE")
			   		.forEach(emp -> {
			   			System.out.println(emp.getEid() + " " + emp.getEname() + " " + emp.getEdesg() + " "
			   					+ emp.getBsal() + " " + emp.getHra() + " " + emp.getDa() + " " + emp.getTotsal());
			   		});
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
	
	
	
	
	
	
	
	
	
	}

}
