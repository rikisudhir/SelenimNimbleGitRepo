package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSIII\\Desktop\\Selenium\\Files\\chromedriver\\chromedriver.exe");
			
			//WebDriver driver = new ChromeDriver();
			
			//driver.get("https://demoqa.com/alerts");
			
			String path = System.getProperty("user.dir");
			
			System.out.println(path);
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe" );
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://demoqa.com/alerts");
			
			

	}

}
