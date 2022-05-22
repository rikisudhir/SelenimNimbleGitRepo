package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSIII\\Desktop\\Selenium\\Files\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/tooltip/");
        driver.manage().window().maximize();
        
        WebElement frame = driver.findElement(By.className("demo-frame"));
        
        driver.switchTo().frame(frame);
        
        driver.findElement(By.id("age")).sendKeys("30");
        
        driver.switchTo().defaultContent();
        
        WebElement header = driver.findElement(By.xpath("//h1"));
        
        System.out.println(header.getText());
        
        

	}

}
