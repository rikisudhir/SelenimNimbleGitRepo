package com.testNG;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelExecution {
	
	
	@Test
	public void Test1() {
		
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSIII\\Desktop\\Selenium\\Files\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
		
	}
	
	@Test
	public void Test2() {
		
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\MSIII\\Desktop\\Selenium\\Files\\Firefoxdriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		 driver.manage().window().maximize();
		
		
		
	}
	

	@Test
	public void Test3() {
		
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\MSIII\\Desktop\\Selenium\\Files\\Firefoxdriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com");
		 driver.manage().window().maximize();
		
		
		
	}
	
	

}
