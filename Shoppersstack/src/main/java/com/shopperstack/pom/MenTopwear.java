package com.shopperstack.pom;

import java.sql.Driver;
import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.ConverterFunctions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenTopwear {
	@FindBy(xpath = "/html/body/div[1]/div[4]/div/div/div[1]/div[3]/div[1]/div/p/span[2]")
	private WebElement priceformate;
	
	@FindBy(xpath = "/html/body/div[1]/div[4]/div/div/div[1]/div[3]/div[1]/div/p/span[3]")
	private WebElement discountPerc;
	
	@FindBy(xpath  ="/html/body/div[1]/div[4]/div/div/div[1]/div[3]/div[1]/div/p/span[1]")
	private WebElement discountprice;
	
	@FindBy(xpath = "/html/body/div[1]/div[4]/div/div/div[1]/div[3]/div[2]/button")
	private WebElement addtocart;
	
	@FindBy(xpath = "/html/body/div[1]/div[4]/div/div/div[1]/div[3]/div[2]/svg/path")
	private WebElement hearticon;
	
	
	
	public MenTopwear(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setPriceFormattingTopwear(WebDriver driver) {
		Mens m=new Mens(driver);
		m.setMen(driver);
		m.setTopwear(driver);
		
		String pricetext = priceformate.getText();
		String currencyRegex = "^₹\\d{1,7}(\\.\\d{2})?$";
        Pattern pattern = Pattern.compile(currencyRegex);
        Matcher matcher = pattern.matcher(pricetext);
        if (matcher.matches()) {
            System.out.println("The price format is correct: " + pricetext);
        } else {
            System.out.println("The price format is incorrect: " + pricetext);
        }

        
             	
	}
	public void setCalculationOfDiscountPrice() {
		String originalprice = priceformate.getText().replace("₹", "").trim();
		String discount = discountPerc.getText().replace("% off", "").trim();
		String disprice = discountprice.getText().replace("₹", "").trim();
		int ogprice = Integer.parseInt(originalprice);
		int disvalue = Integer.parseInt(discount);
		int finalprice = Integer.parseInt(disprice);
		
		int expectedprice = ogprice-(ogprice*disvalue)/100;
		
		if(finalprice==expectedprice) {
			 System.out.println("Discount calculation is correct.");
             System.out.println("Original Price: ₹" + ogprice);
             System.out.println("Discount Percentage: " + disvalue + "%");
             System.out.println("Expected Discounted Price: ₹" + expectedprice);
             System.out.println("Displayed Discounted Price: ₹" + finalprice);
			
			
		}
		
		else
		{
			 System.out.println("Discount calculation is incorrect.");
             System.out.println("Original Price: ₹" + ogprice);
             System.out.println("Discount Percentage: " + disvalue + "%");
             System.out.println("Expected Discounted Price: ₹" + expectedprice);
             System.out.println("Displayed Discounted Price: ₹" + finalprice);
		}	
		
	}
	
	
	public boolean setAddTOCartAdded(WebDriver driver) {
		   
				String beforeclick = addtocart.getText();
				
				System.out.println("Before click"+ beforeclick);
				
				 addtocart.click(); 
				 
				 WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
				 
				 try {
					 
					Boolean textChanged = wait.until(ExpectedConditions.textToBePresentInElement(addtocart, "ADDED"));
					 
				 
				String afterclick = addtocart.getText();
				System.out.println("After click "+afterclick);
				
				return textChanged;
				 }
				 catch(Exception e){
					 
					 System.out.println("Error"+e.getMessage());
					 return false;
				 }
				
				 
		
	}
	
	public void heartIcon() {
		
		hearticon.click();
		
	}
}