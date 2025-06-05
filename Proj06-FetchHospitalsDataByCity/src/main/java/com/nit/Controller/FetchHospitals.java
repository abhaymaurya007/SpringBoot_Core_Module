package com.nit.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.Component.Hospital;

import com.nit.Service.FetchHospitalServiceImpl;

@Controller("fetchHospitalsController")
public class FetchHospitals {

    

	@Autowired
	public FetchHospitalServiceImpl fetchHospitalService;

   
	
	public List<Hospital> getHospitalsByCity(String city) {
		List<Hospital> hospitalsByCity = null;
		try {
		 hospitalsByCity = fetchHospitalService.getHospitalsByCity(city);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return hospitalsByCity;
	}
}
