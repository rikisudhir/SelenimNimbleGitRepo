package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\MSIII\\Desktop\\Selenium\\Files\\chromedriver\\chromedriver.exe");
			
		 WebDriver driver = new ChromeDriver();
			
		 driver.get("https://www.facebook.com");
			
		 Thread.sleep(5000);
		 
		 Robot robot = new Robot();
		 
		 driver.findElement(By.id("email")).sendKeys("sudhir");
		 
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 
		 robot.keyPress(KeyEvent.VK_A);
		 
		 Thread.sleep(3000);
		 
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 
		 robot.keyRelease(KeyEvent.VK_A);
		 
		 Thread.sleep(1000);
		 
         robot.keyPress(KeyEvent.VK_CONTROL);
		 
		 robot.keyPress(KeyEvent.VK_C);
		 
		 Thread.sleep(1000);
		 
        robot.keyRelease(KeyEvent.VK_CONTROL);
		 
		robot.keyRelease(KeyEvent.VK_C);
		
		Thread.sleep(1000);
		
		robot.keyPress(KeyEvent.VK_TAB);
		
		robot.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(1000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		 
		robot.keyPress(KeyEvent.VK_V);
		
		Thread.sleep(1000);
		
		
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 

	}

}
