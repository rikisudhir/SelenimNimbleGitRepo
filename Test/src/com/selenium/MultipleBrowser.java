package com.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSIII\\Desktop\\Selenium\\Files\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(5000);
		
		
		String parent_window= driver.getWindowHandle();
		
		System.out.println(parent_window);
		
		driver.findElement(By.id("opentab")).click();
		
		Thread.sleep(2000);
		
		Set<String> s = driver.getWindowHandles();
		
	    Iterator<String> itr = s.iterator();
	    
	    while(itr.hasNext()) {
	    	
	    	String child_window= itr.next();
	    	
	    	if(!parent_window.equals(child_window)) {
	    		
	    		driver.switchTo().window(child_window);
	    		
	    		System.out.println(driver.getCurrentUrl());
	    		
	    		System.out.println(driver.getTitle());
	    		
	    		driver.close();
	    	}
	    }

	}

}
