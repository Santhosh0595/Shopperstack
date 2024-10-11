package com.shopperstack.testscript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.shopperstack.generic.BaseClass;
import com.shopperstack.pom.Mens;


@Listeners(com.shopperstack.generic.ListenerImplimentation.class)

public class HomeNavigationMenModuleVerify extends BaseClass {
	
	@Test(retryAnalyzer=com.shopperstack.generic.Iretry.class)
	public void productList() throws Throwable {
		   
		Mens m=new Mens(driver);
		m.setMen(driver);
		m.setTopwear(driver);
		m.setMen(driver);
		m.setTshirt(driver);
		m.setMen(driver);
		m.setShirt(driver);
		m.setMen(driver);
		m.setSweatShirt(driver);
		m.setMen(driver);
		m.setSWeaters(driver);
		m.setMen(driver);
		m.setJackets(driver);
		m.setMen(driver);
		m.setBlazer_coats(driver);
		m.setMen(driver);
		m.setIndian(driver);
		m.setMen(driver);
		m.setKurtas(driver);
		m.setMen(driver);
		m.setSherwanis(driver);
		m.setMen(driver);
		m.setNehru_suite(driver);
		m.setMen(driver);
		m.setDhoties(driver);
		m.setMen(driver);
		m.setBottomwear(driver);
		m.setMen(driver);
		m.setJeans(driver);
		m.setMen(driver);
		m.setTrouser(driver);
		m.setMen(driver);
		m.setShorts(driver);
		m.setMen(driver);
		m.setTrack(driver);
	
		
		
	}
	
	

}
