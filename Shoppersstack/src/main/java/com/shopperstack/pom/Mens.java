package com.shopperstack.pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Mens {
	@FindBy(xpath = "//a[text()=\"Men\"]")
	private WebElement men;
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/div/nav/ul/li[1]/div/aside/div[1]/ul[1]/li[2]/a")
	private WebElement tshirt;
	
	@FindBy(xpath ="//a[text()=\"Topwear\"]")
	private WebElement Topwear;
	
	@FindBy(xpath = "//aside[@class=\"men\"]//a[text()=\"Shirts\"]")
	private WebElement Shirt;
	
	@FindBy(xpath = "//a[text()=\"Sweatshirt\"]")
	private WebElement Sweatshirts;
	
	@FindBy(xpath = "//aside[@class=\"men\"]//a[text()=\"Sweaters\"]")
	private WebElement Sweaters;
	
	@FindBy(xpath = "//aside[@class=\"men\"]//a[text()=\"Jackets\"]")
	private WebElement Jackets;
	
	@FindBy(xpath = "//aside[@class=\"men\"]//a[text()=\"Blazers&Coats\"]")
	private WebElement Blazers_coats;
	
	@FindBy(xpath ="//aside[@class=\"men\"]//a[text()=\"Indian & Festive Wear\"]")
	private WebElement indian;
	
	@FindBy(xpath = "//aside[@class=\"men\"]//a[text()=\"Kurtas & kurta Sets\"]")
	private WebElement Kurtas;
	
	@FindBy(xpath  ="//aside[@class=\"men\"]//a[text()=\"Sherwanis\"]")
	private WebElement Sherwanis;
	
	@FindBy(xpath = "//aside[@class=\"men\"]//a[text()=\"Nehru Jakets\"]")
	private WebElement Nehru;
	
	@FindBy(xpath = "//aside[@class=\"men\"]//a[text()=\"Dhotis\"]")
	private WebElement Dhotis;
	
	@FindBy(xpath = "//aside[@class=\"men\"]//a[text()=\"BottomWear\"]")
	private WebElement Bottomwear;
	
	@FindBy(xpath ="//aside[@class=\"men\"]//a[text()=\"Jeans\"]")
	private WebElement Jeans;
	
	@FindBy(xpath = "//aside[@class=\"men\"]//a[text()=\"Trousers\"]")
	private WebElement Trousers;
	
	@FindBy(xpath = "//aside[@class=\"men\"]//a[text()=\"Shorts\"]")
	private WebElement Shorts;
	
	@FindBy(xpath = "//aside[@class=\"men\"]//a[text()=\"Tracks Pants & Joggers\"]")
	private WebElement Track;
	
	@FindBy(xpath = "/html/body/div[1]/section[2]/article/div[2]/div/div[2]/a/img")
	private WebElement menimagelink;
	
	
	
	
	
	public Mens(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void setMenImage(WebDriver driver) {
		Actions a=new Actions(driver);
		
		a.scrollToElement(menimagelink).click().perform();
		
	}
	
	public void setMen(WebDriver driver) {
	   Actions a=new Actions(driver);
	   a.clickAndHold(men).perform();
	   
	   

	}

	public void setTshirt(WebDriver driver)  {
		
	
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", tshirt);
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(15));
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loadingSpinner")));
		System.out.println("T-shirts page  is displayed");
		//driver.navigate().refresh();
		

		
		
		}
	
	public void setTopwear(WebDriver driver) {
		
	((JavascriptExecutor)driver).executeScript("arguments[0].click();", Topwear);
	
	
		System.out.println("Topwear page ids displayed");
	
		
	}
	
	public void setShirt(WebDriver driver) {
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", Shirt);
	
		System.out.println("Shirt page is display");
		
		
	}
	
	public void setSweatShirt(WebDriver driver) {
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",Sweatshirts);
		
		System.out.println("SweatShirt page is displayed");
		
	}
	
	public void setSWeaters(WebDriver driver) {
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", Sweaters);
		
		System.out.println("Sweater page is displayed");
		
	}
	
	public void setJackets(WebDriver driver) {
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", Jackets);
		
		System.out.println("Jackets page is displayed");
		
		
	}
	
	public void setBlazer_coats(WebDriver driver) {
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", Blazers_coats);
		
		System.out.println("Blazer&coats Page is displayed");
		
	}
	
	public void setIndian(WebDriver driver) {
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", indian);
		
		System.out.println("Indian & Festive page is displayed");
	}
	
	public void setKurtas(WebDriver driver) {
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", Kurtas);
		
		System.out.println("Kurtas & kurta set page is displayed");
	}
	
	public void setSherwanis(WebDriver driver) {
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", Sherwanis);
		
		System.out.println("Sherwanis page is displayed");
	}
	
	public void setNehru_suite(WebDriver driver) {
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", Nehru);
		
		System.out.println("Nehru_suite page is displayed");
	}
	
	public void setDhoties(WebDriver driver) {
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", Dhotis);
		
		System.out.println("Dhoties page is displayed");
	}
	
	public void setBottomwear(WebDriver driver) {
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", Bottomwear);
		
		System.out.println("Bottomwear page is displayed");
	}
	
	public void setJeans(WebDriver driver) {
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", Jeans);
		
		System.out.println("Jeans page is displayed");
	}
	
	public void setTrouser(WebDriver driver) {
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", Trousers);
		
		System.out.println("Trousers page is displayed");
	}
	public void setShorts(WebDriver driver) {
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",Shorts);
		
		System.out.println("Shorts page is displayed");
		
	}
	public void setTrack(WebDriver driver) {
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",Track);
		
		System.out.println("Tracks Pants & Joggers page is displayed");
		
	}
	
}

