package com.nit.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("HotelBean")
@Data
public class Hotel {
	

	@Value("12345")
	private Integer hotelId;
	@Value("${hotel.name}")
	private String hotelName;
	@Value("${hotel.address}")
	private String hoteladdress;
	@Value("${hotel.contactno}")
	private String mobileNo;
	@Value("${customer.name}")
	private String CustomerName;
	@Value("#{${menu.sambarrate} + ${menu.vadasrate} + ${menu.idlyrate} + ${menu.dosarate}}")
	private Float billAmount;

	@Value("${os.name}")
	private String osName;
	@Value("${user.name}")
	private String WindowsUserName;
	@Value("${Path}")
	private String pathData;
	
	
	
	
}
