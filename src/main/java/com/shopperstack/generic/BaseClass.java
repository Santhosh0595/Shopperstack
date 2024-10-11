package com.shopperstack.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.shopperstack.pom.HomePage;
import com.shopperstack.pom.Login;

public class BaseClass {
 
	public WebDriver driver =null;
	
	
	@BeforeSuite(alwaysRun = true)
	public void bfConfig() {
		Reporter.log("DataBase connectivity successfully",true);
	}
	@AfterSuite(alwaysRun = true)
	public void afConfig() {
		 Reporter.log("DataBase disconnect successfully",true);  
	}
	@BeforeClass(alwaysRun = true)
	public void launchBrowser() throws IOException {
		Reporter.log("Browser Open Successfully",true);
			FileLib f= new FileLib();
			String browser = f.getPropertyData("browser");
			
		if(browser.equals("chrome")) {
			driver= new ChromeDriver();
			
		}
		else if (browser.equals("edge")) {
			driver=new EdgeDriver();
			
		}
		else if (browser.equals("firefox")) {
			driver=new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(200));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
		
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		Reporter.log("Browser Close Sucessfully",true);
		if(driver!=null) {
		driver.quit();
		}
	}
	
	
	@BeforeMethod(alwaysRun = true)
	public void login() throws IOException {
		Reporter.log("Login sucessfully",true);
		FileLib f=new FileLib();
		String url = f.getPropertyData("url");
		String username = f.getPropertyData("username");
		String password = f.getPropertyData("password");
		 driver.get(url);
		 
		 HomePage page=new HomePage(driver);
		 
		 page.setLoginbtn(driver);
		 
		 Login log=new Login(driver);
		 log.setLogin(username,password);
		  
		 
	}
	
	@AfterMethod(alwaysRun = true)
	public void logout() {
		Reporter.log("Logout Sucessfully",true);
		HomePage page=new HomePage(driver);
		page.setActsetting(driver);
		page.setLogoutbtn();
		
		
	}
	

}

