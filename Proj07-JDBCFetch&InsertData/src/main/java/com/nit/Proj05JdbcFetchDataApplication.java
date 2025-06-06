package com.nit;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.Beans.Employee;
import com.nit.Controller.InsertEmployeeController;
import com.nit.Controller.PayrollOperationControler;

@SpringBootApplication
public class Proj05JdbcFetchDataApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Proj05JdbcFetchDataApplication.class, args);
	
	     Scanner sc = new Scanner(System.in);
	     
	     System.out.println("Enter 1 for get Employee by Desg");
	     
	     System.out.println("Enter 2 for Insert  Employee Data to Data database");
	     System.out.println("Enter the Value :"); 
	     int choice = sc.nextInt();
	     if(choice == 1) {
	    	  PayrollOperationControler controller = run.getBean("payrollController", PayrollOperationControler.class);
		       try {
				controller.showEmployeesByDesgs("dse", "sdel", "sas")
				   		.forEach(emp -> {
				   			System.out.println(emp.getEid() + " " + emp.getEname() + " " + emp.getEdesg() + " "
				   					+ emp.getBsal() + " " + emp.getHra() + " " + emp.getDa() + " " + emp.getTotsal());
				   		});
			} catch (Exception e) {
				
				e.printStackTrace();
			}
	     } else if(choice == 2) {
	    	
	    	 InsertEmployeeController controller1 = run.getBean("insertEmployeeController", InsertEmployeeController.class);
	    	 System.out.println("Enter Employee ID :");
	    	 String eid = sc.next();
	    	 System.out.println("Enter Employee Name :");
	    	 String ename = sc.next();
	    	 System.out.println("Enter Employee Designation :");
	    	 String edesg = sc.next();
	    	 System.out.println("Enter Employee Basic Salary :");
	    	 Float bsal = sc.nextFloat();
	    	 System.out.println("Enter Employee HRA :");
	    	 Float hra = sc.nextFloat();
	    	 System.out.println("Enter Employee DA :");
	    	 Float da = sc.nextFloat();
	    	
	    	 Employee employee = new Employee();
	    	 employee.setEid(eid);
	    	 employee.setEname(ename);
	    	 employee.setEdesg(edesg);
	    	 employee.setBsal(bsal);
	    	 employee.setHra(hra);
	    	 employee.setDa(da);
	    	 employee.setTotsal(bsal + hra + da);
	    	 
	    	controller1.insertEmployeeData(employee);
	     }
	     
	     run.close();
	     sc.close();
	
	
	
	
	
	
	
	
	
	
	}

}
