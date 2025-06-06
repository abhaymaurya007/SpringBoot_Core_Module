package com.nit.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.Beans.Employee;
import com.nit.Service.InsertEmployeeService;
@Controller("insertEmployeeController")
public class InsertEmployeeController {
     
	@Autowired
	public InsertEmployeeService insertEmployeeService;

  public void insertEmployeeData(Employee employee) {
	try {
	  int result = insertEmployeeService.insertEmployee(employee);
	  if (result > 0) {
		System.out.println("Employee inserted successfully.");
	  } else {
		System.out.println("Failed to insert employee.");
	  }
	} catch (Exception e) {
	  e.printStackTrace();
	}
  }





}
