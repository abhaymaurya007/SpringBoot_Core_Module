package com.nit.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.Beans.Employee;
import com.nit.Service.IEmployeeService;
@Controller("payrollController")
public class PayrollOperationControler {
     @Autowired
	private IEmployeeService empService;
	
	public List<Employee> showEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> list = null;
		try {
			list = empService.getAllEmployeesByDesgs(desg1, desg2, desg3);
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return list;
	}
	
	
}
