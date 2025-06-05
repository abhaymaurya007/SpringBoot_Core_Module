package com.nit.Service;

import java.util.List;

import com.nit.Component.Hospital;

public interface FetchHospitalService {
	
	
	public List<Hospital> getHospitalsByCity(String city) throws Exception;
	
	

}
