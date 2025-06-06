package com.nit.DAO;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nit.Beans.Employee;

@Repository("insertEmployeeDAO")
public class InsertEmployeeImpl implements InsertEmployee {
     
	public static final String INSERT_QUERY = "INSERT INTO EMP11 VALUES(?,?,?,?,?,?,?)";
	
	@Autowired
	public DataSource ds;
	
	


	@Override
	public int insertEmployee(Employee e) throws Exception {
		
		try (var con = ds.getConnection();
			 var ps = con.prepareStatement(INSERT_QUERY)) {
			
			ps.setString(1, e.getEid());
			ps.setString(2, e.getEname());
			ps.setString(3, e.getEdesg());
			ps.setFloat(4, e.getBsal());
			ps.setFloat(5, e.getHra());
			ps.setFloat(6, e.getDa());
			ps.setFloat(7, e.getTotsal());
			
			return ps.executeUpdate();
		} 
		catch (SQLException ex1) {
			ex1.printStackTrace();
			throw ex1;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			throw ex;
		}
		
		
		
		
		
	}

}
