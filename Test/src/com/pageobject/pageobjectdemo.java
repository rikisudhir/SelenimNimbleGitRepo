package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class pageobjectdemo {
	
	WebDriver driver;
	
	@BeforeTest
	public void beforetest(){
        
		PageFactory.initElements(driver, driver);
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe" );
		driver= new ChromeDriver();
				
	}
	
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit;
	
	
	
	
		
	@Test
	public void test() {
		
		driver.get("https://www.facebook.com/");
		
		username.sendKeys("rikisudhir");
		password.sendKeys("password");
	}
	
	

}
