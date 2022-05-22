package com.selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSIII\\Desktop\\Selenium\\Files\\chromedriver\\chromedriver.exe");
			
	WebDriver driver = new ChromeDriver();
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
			
	driver.get("https://demoqa.com/alerts");
	
	driver.findElement(By.id("timerAlertButton")).click();
	
	wait.until(ExpectedConditions.alertIsPresent());
	
	Alert alert = driver.switchTo().alert();
	
	alert.accept();

	}

}
