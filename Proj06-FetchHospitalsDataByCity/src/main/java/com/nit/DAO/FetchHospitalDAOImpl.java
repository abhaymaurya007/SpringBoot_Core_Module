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

import com.nit.Component.Hospital;
@Repository("fetchHospitalDAO")
public class FetchHospitalDAOImpl implements FetchHospitalDAO {

	@Autowired
	public DataSource dataSource;
	@Override
	public List<Hospital> getHospitalsByCity(String city) throws Exception {
		
		List<Hospital> hospitals = new ArrayList<>();
		
		
		try(Connection con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement("SELECT * FROM hospital WHERE city = ?")) {
			
			ps.setString(1, city);
			try (ResultSet rs = ps.executeQuery()) {
				while (rs.next()) {
					Hospital hospital = new Hospital();
					hospital.setId(rs.getInt("hid"));
					hospital.setName(rs.getString("name"));
					hospital.setCity(rs.getString("city"));
					hospitals.add(hospital);
					
				}
			}
		} catch (SQLException ef) {
			ef.printStackTrace();
			throw ef;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Error in getHospitalsByCity", e);
		}
	
		return hospitals; 
	}

}
