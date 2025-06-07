package com.nit.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component("MenuItemPricesBean")
@Data
public class MenuItemPrices {
	
	@Value("${menu.sambarrate}")
	private Float sambarrate;
	@Value("${menu.vadasrate}")
	private Float vadasrate;
	@Value("${menu.idlyrate}")
	private Float idlyrate;
	@Value("${menu.dosarate}")
	private Float dosarate;
	
	
	

}
