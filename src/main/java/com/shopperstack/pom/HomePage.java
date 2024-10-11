package com.shopperstack.pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage{

	@FindBy(xpath = "/html/body/div[1]/section[1]/article/div[2]/button")
	private WebElement loginbtn;
	@FindBy(xpath = "/html/body/div[1]/section[1]/article/div[3]/div[1]/button/span[1]")
	private WebElement actsetting;
	@FindBy(xpath = "/html/body/div[3]/div[3]/ul/li[7]")
	private WebElement logoutbtn;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements( driver, this);
	}
	
	public void setLoginbtn(WebDriver driver) {
			WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(50));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loadingSpinner")));
			//WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(loginbtn));
			//ele.click();
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", loginbtn);
		
	}
	public void setActsetting(WebDriver driver) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
		wait.until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
		actsetting.click();
	
	}
	public void setLogoutbtn() {
					logoutbtn.click();
	}

	
}
