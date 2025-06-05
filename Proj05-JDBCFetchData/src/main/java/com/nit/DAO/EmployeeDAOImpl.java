package com.nit.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.nit.Beans.Employee;

public class EmployeeDAOImpl implements IEmployeeDAO {
	public static final String GET_ALL_EMPLOYEES_BY_DESGS = "SELECT * FROM EMP WHERE EDESG IN(?,?,?)";
	
	    @Autowired
	    private DataSource ds;
	    

	@Override
	public List<Employee> getAllEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
		
		
		List<Employee> list = null;
		try (Connection con=ds.getConnection();PreparedStatement ps=con.prepareStatement(GET_ALL_EMPLOYEES_BY_DESGS);) {
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			
			try(ResultSet rs = ps.executeQuery()){
				while(rs.next()) {
					Employee emp = new Employee();
			
					
					
					
				}
			}
			
			
			
		return list;
			
		}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		//return null;
	}

}
