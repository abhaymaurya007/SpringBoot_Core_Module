package com.nit.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.nit.Beans.Employee;
import com.nit.DAO.InsertEmployee;


@Service("insertEmployeeService")
public class InsertEmployeeServiceImpl implements InsertEmployeeService {
   
	@Autowired
	InsertEmployee insertEmployeeDAO;
	
	@Override
	public int insertEmployee(Employee e) throws Exception {
		
		return insertEmployeeDAO.insertEmployee(e);
	}

}
