package com.nit.Service;

import java.util.List;

import com.nit.Beans.Employee;

public interface IEmployeeService {
	
	public List<Employee> getAllEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception;

}
