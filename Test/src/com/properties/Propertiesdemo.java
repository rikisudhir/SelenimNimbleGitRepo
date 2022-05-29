package com.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Propertiesdemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		FileInputStream stream ;
		
		stream= new FileInputStream("D:\\GitHubRepo\\SelenimNimbleGitRepo\\Test\\src\\com\\properties\\test.properties");
		
		Properties config= new  Properties();
		
		config.load(stream);
		
		
		String url = config.getProperty("url");
		String username= config.getProperty("username");
		String password = config.getProperty("password");
		
		
		String path = System.getProperty("user.dir");
		
		System.out.println(path);
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("email")).sendKeys(username);
		
		driver.findElement(By.name("email")).sendKeys(password);
		
		
		

	}

}
