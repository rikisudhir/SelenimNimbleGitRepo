package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSIII\\Desktop\\Selenium\\Files\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        
        WebElement element= driver.findElement(By.id("email"));
        
        element.sendKeys("Sudhir");
        
        Actions action = new Actions(driver);
        
        action.moveToElement(element).doubleClick().build().perform();
        
        action.moveToElement(element).contextClick().build().perform();
        
        action.moveToElement(element).clickAndHold().build().perform();
        
        Thread.sleep(2000);
        
        
        
        

	}

}
