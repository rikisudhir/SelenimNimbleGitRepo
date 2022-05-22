package com.selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumDemo2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSIII\\Desktop\\Selenium\\Files\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        
        
        System.out.println(driver.getTitle());
        
        System.out.println(driver.getCurrentUrl());
        
        driver.findElement(By.linkText("Forgotten password?")).click();
        
       String actualurl=driver.getCurrentUrl();
        
        String expectedurl= "https://www.facebook.com/ctx=recover&ars=facebook_login&from_login_screen=0";
        
        if(actualurl.equalsIgnoreCase(expectedurl)) {
        	
        	System.out.println("Test case pass");
        }else {
        	
        	System.out.println("Test case fail");
        }
        
        
		
		
		
		

	}

}
