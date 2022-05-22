package com.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSIII\\Desktop\\Selenium\\Files\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.manage().window().maximize();
		
		String parent_window= driver.getWindowHandle();
		
		driver.findElement(By.id("opentab")).click();
		
		
		Set<String> s = driver.getWindowHandles();
		
		Iterator<String> itr = s.iterator();
		
		while(itr.hasNext()) {
		
		 String child_window= itr.next();
		 
		 System.out.println(child_window);
		 
		 if(!parent_window.equals(child_window)) {
			 
			 driver.switchTo().window(child_window);
			 
			 System.out.println(driver.getCurrentUrl());
				
				driver.close();
			}

	}
		
		
		
		
	}
}
