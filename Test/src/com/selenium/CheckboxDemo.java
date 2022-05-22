package com.selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSIII\\Desktop\\Selenium\\Files\\chromedriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();
        
       List<WebElement> list= driver.findElements(By.name("tool"));
       
       for(int i=0;i<=list.size();i++) {
    	   
    	   list.get(i).click();
       }
       
       

	}

}
