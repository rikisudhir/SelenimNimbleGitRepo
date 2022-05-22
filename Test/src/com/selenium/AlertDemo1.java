package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		    System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSIII\\Desktop\\Selenium\\Files\\chromedriver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demoqa.com/alerts");
	        driver.manage().window().maximize();
	        
	        driver.findElement(By.id("alertButton")).click();
	        
	        
	        Alert alert = driver.switchTo().alert();
	        
	        Thread.sleep(3000);
	        System.out.println( alert.getText());
	        
	        alert.dismiss();
	        
	       
	       

	}

}
