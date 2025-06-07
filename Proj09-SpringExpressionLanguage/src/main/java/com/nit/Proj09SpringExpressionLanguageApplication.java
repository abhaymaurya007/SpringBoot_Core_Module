package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.beans.Hotel;
import com.nit.beans.MenuItemPrices;

@SpringBootApplication
public class Proj09SpringExpressionLanguageApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Proj09SpringExpressionLanguageApplication.class, args);
		
		Hotel hotel = run.getBean("HotelBean", Hotel.class);
		System.out.println("Hotel Details : " + hotel);
		System.out.println("=================");
		MenuItemPrices menuItemPrices = run.getBean("MenuItemPricesBean", MenuItemPrices.class);
	
	   		System.out.println("Menu Item Prices : " + menuItemPrices);
	}

}
