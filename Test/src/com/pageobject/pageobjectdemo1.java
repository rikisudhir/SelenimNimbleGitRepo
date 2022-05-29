package com.pageobject;

import java.util.Stack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageobjectdemo1 {
	
	static WebDriver driver;
	
	pageobjectdemo1(WebDriver driver){
		
		PageFactory.initElements(driver, driver);
	}
	
	
	@FindBy(name="email")
	static
	WebElement username;
	
	@FindBy(id="pass")
	static
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe" );
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		username.sendKeys("rikisudhir");
		password.sendKeys("password");
		
		

	}

}
