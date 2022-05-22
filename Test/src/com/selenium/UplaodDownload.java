package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UplaodDownload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSIII\\Desktop\\Selenium\\Files\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/upload-download");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        driver.manage().window().maximize();
        
        WebElement element = driver.findElement(By.id("uploadFile"));
        
        element.sendKeys("C:\\Users\\MSIII\\Desktop\\Selenium\\Files\\chromedriver\\chromedriver.exe");

        Thread.sleep(3000);
        
        driver.findElement(By.id("downloadButton")).click();
        
        
	}

}
