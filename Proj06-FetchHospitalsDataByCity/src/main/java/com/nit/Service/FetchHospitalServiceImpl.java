package com.nit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.Component.Hospital;
import com.nit.DAO.FetchHospitalDAOImpl;
@Service("fetchHospitalService")
public class FetchHospitalServiceImpl implements FetchHospitalService {
	
	@Autowired
	public FetchHospitalDAOImpl fetchHospitalDAO;

	@Override
	public List<Hospital> getHospitalsByCity(String city) throws Exception {
		List<Hospital> hospitals; 
		try {
			
			 hospitals = fetchHospitalDAO.getHospitalsByCity(city);
			
		} catch (Exception e) {
			throw e;
		}
		
		
		return hospitals;
	}

}
