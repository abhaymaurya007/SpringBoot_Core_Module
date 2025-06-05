package com.nit.DAO;

import java.util.List;

import com.nit.Component.Hospital;

public interface FetchHospitalDAO {
	
	
	public List<Hospital> getHospitalsByCity(String city) throws  Exception;

}
