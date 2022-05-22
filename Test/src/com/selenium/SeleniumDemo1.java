package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSIII\\Desktop\\Selenium\\Files\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("Sudhir");
		driver.findElement(By.id("pass")).sendKeys("Ranjan");
		
		 String s1 =driver.findElement(By.name("login")).getText();
		 System.out.println(s1);
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(2000);

	}

}
