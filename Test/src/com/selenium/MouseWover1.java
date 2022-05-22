package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseWover1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSIII\\Desktop\\Selenium\\Files\\chromedriver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demoqa.com/tool-tips");
	        driver.manage().window().maximize();
	        
	        Actions action = new Actions(driver);
	        
	        WebElement element = driver.findElement(By.id("toolTipButton"));
	        
	        action.moveToElement(element).build().perform();
	        
	        Thread.sleep(5000);
	        
	        
	        
	        

	}

}
