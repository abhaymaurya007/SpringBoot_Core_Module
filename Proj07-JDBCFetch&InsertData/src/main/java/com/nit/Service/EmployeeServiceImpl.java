package com.nit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.Beans.Employee;
import com.nit.DAO.IEmployeeDAO;
@Service("empService")
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeDAO dao;
	
	
	
	@Override
	public List<Employee> getAllEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> lis;  
		try {
			lis= dao.getAllEmployeesByDesgs(desg1, desg2, desg3);
			 
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return lis;
	}

}
