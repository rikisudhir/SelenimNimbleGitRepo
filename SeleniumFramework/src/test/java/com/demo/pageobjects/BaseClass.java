package com.demo.pageobjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.demo.util.ConfigParser;

public class BaseClass {
	
	public static WebDriver driver;
	
	public ConfigParser objConfig;
	
	public ConfigParser testDataConfig;
	
	public static String ConfigFilePath="";
	
	public static String testDataFilePath="";
	
	@BeforeTest	
	@Parameters({"browser"})
	public void setUp(@Optional String browser) throws IOException {
		
		if (browser==null) {
	    	
	    	browser="chrome";
	    }
		
		ConfigFilePath= System.getProperty("user.dir")+"/Config/Config.properties";
		
		objConfig = new ConfigParser(ConfigFilePath);
		
		System.out.println(objConfig.getPropertyvalue("baseUrl"));
		
		testDataFilePath= System.getProperty("user.dir")+"\\src\\test\\java\\com\\demo\\testdata\\testdata.properties";
		
		System.out.println(testDataFilePath);
		testDataConfig = new ConfigParser(testDataFilePath);
		
		System.out.println(testDataConfig.getPropertyvalue("postloginUrl"));
		
		
		if(browser.equals("chrome")){
			
			System.out.println("chrome");
			
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+objConfig.getPropertyvalue("chromeDriverPath") );
			
			System.out.println("test");
			
			driver = new ChromeDriver();
			
			System.out.println("test1");
				
			
		}else if(browser.equals("ff")) {
			
         System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/Drivers/geckodriver.exe");
			
			driver=new FirefoxDriver();
		}
		
		
		
		
		
	}
	
	
	
	
	
	

}
