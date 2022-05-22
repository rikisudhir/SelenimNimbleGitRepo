package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSIII\\Desktop\\Selenium\\Files\\chromedriver\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demoqa.com/droppable/");
			
			Actions action= new Actions(driver);
			
			Thread.sleep(5000);
			
	        driver.manage().window().maximize();
	        
	        WebElement drag = driver.findElement(By.id("draggable"));
	        
	        WebElement drop = driver.findElement(By.id("droppable"));
	        
	        action.dragAndDrop(drag, drop).build().perform();
	        
	        Thread.sleep(3000);
	        
	     
	        
	        

	}

}
