package com.shopperstack.testscript;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.shopperstack.generic.BaseClass;
import com.shopperstack.pom.MenTopwear;
import com.shopperstack.pom.Mens;

@Listeners(com.shopperstack.generic.ListenerImplimentation.class)
public class MenTopWearAddToCartVerify extends BaseClass {

	
	@Test(retryAnalyzer = com.shopperstack.generic.Iretry.class)
	public void addToCart() {
		
		Mens page=new Mens(driver);
		page.setMenImage(driver);
		page.setMen(driver);
		page.setTopwear(driver);
		
		MenTopwear m=new MenTopwear(driver);
		
		//m.setAddTOCartAdded(driver);
		m.heartIcon();
		
		
	}
	
}
