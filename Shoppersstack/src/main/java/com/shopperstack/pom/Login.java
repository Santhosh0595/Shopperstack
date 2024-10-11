package com.shopperstack.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	@FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div/section/article/form/div[1]/div/input")
	private WebElement usernametextfield;
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div/section/article/form/div[2]/div/input")
	private WebElement passwordtextfield;
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div/section/article/form/button[1]")
	private WebElement loginbutton;
	
	public void setLogin(String username,String password) {
	
		
			usernametextfield.sendKeys(username);
			passwordtextfield.sendKeys(password);
			
			loginbutton.click();		
		
		
	}
	
	public  Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
		 
	}
	 
}