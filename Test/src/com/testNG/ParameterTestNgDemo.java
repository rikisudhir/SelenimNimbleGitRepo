package com.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTestNgDemo {
	
	
	@Test
	
	@Parameters({"browser"})
	public void testfacebook(String browser) {
		
		if(browser.equals("chrome")){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSIII\\Desktop\\Selenium\\Files\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        
        
	}else if(browser.equals("ff")){
		
      System.setProperty("webdriver.gecko.driver", "C:\\Users\\MSIII\\Desktop\\Selenium\\Files\\Firefoxdriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
	}
	

}
	
}
