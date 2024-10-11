package com.shopperstack.testscript;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.shopperstack.generic.BaseClass;
import com.shopperstack.pom.MenTopwear;
import com.shopperstack.pom.Mens;


@Listeners(com.shopperstack.generic.ListenerImplimentation.class)
public class MenTopWearDiscountCalculationVerify extends BaseClass{

	
	@Test(retryAnalyzer = com.shopperstack.generic.Iretry.class)
	 public  void discountcalculation() {
			Mens m=new Mens(driver);
			m.setMenImage(driver);
			m.setMen(driver);
			m.setTopwear(driver);	
			
			
			MenTopwear t=new MenTopwear(driver);
			
			t.setCalculationOfDiscountPrice();
	 }
}
