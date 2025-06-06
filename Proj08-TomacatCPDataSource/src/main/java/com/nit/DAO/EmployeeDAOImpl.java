package com.nit.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nit.Beans.Employee;

@Repository("empDAO")
public class EmployeeDAOImpl implements IEmployeeDAO {
	public static final String GET_ALL_EMPLOYEES_BY_DESGS = "SELECT * FROM EMP11 WHERE EDESG IN(?,?,?)";
	
	    @Autowired
	    private DataSource ds;
	    

	@Override
	public List<Employee> getAllEmployeesByDesgs(String desg1, String desg2, String desg3) throws Exception {
		
		
		List<Employee> list = new ArrayList<Employee>();
		try (Connection con=ds.getConnection();PreparedStatement ps=con.prepareStatement(GET_ALL_EMPLOYEES_BY_DESGS);) {
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			
			try(ResultSet rs = ps.executeQuery()){
				while(rs.next()) {
					Employee emp = new Employee();
					emp.setEid(rs.getString(1));
					emp.setEname(rs.getString(2));
					emp.setEdesg(rs.getString(3));
					emp.setBsal(rs.getFloat(4));
					emp.setHra(rs.getFloat(5));
					emp.setDa(rs.getFloat(6));
					emp.setTotsal(rs.getFloat(7));
			
					list.add(emp);
					
					
				}
			}
			
			
			
	
			
		}
		catch (SQLException f) {
			f.printStackTrace();
			throw f;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
		return list;
		
	}

}
