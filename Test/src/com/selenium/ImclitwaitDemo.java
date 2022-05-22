package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImclitwaitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSIII\\Desktop\\Selenium\\Files\\chromedriver\\chromedriver.exe");
			
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
			
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.name("email")).sendKeys("Sudhir@gmail.com");
	    
	    
	    
	    
	    

	}

}
