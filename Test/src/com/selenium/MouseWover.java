package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseWover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSIII\\Desktop\\Selenium\\Files\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(5000);
		
        driver.manage().window().maximize();
        
        WebElement element = driver.findElement(By.linkText("Forgotten password?"));
        
        Actions action = new Actions(driver);
        
        action.moveToElement(element).build().perform();
        
        Thread.sleep(5000);
        
        
        
       
        
        
        
        
        
        

	}

}
